package com.labs.weather.service.Impl;

import com.labs.weather.model.dao.WeatherInfo;
import com.labs.weather.model.dto.WeatherData;
import com.labs.weather.model.exception.ServiceUnavailableException;
import com.labs.weather.repository.WeatherInfoRepository;
import com.labs.weather.service.WeatherInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import javax.transaction.Transactional;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;
/*
A service to read the Weather details from Weather Info API and save them to database.
 */
public class WeatherInfoServiceImpl implements WeatherInfoService {
    @Autowired
    private WeatherInfoRepository weatherInfoRepository;
    @Autowired
    RestTemplate restTemplate;

    private static final Logger log = LoggerFactory.getLogger(WeatherInfoServiceImpl.class);
    @Value("${weather.info.app.url}")
    private String Url;

    /**
     * Method to read the Weather Details from Weather Info API and save them to Database.
     * @param cityId
     * @param token
     * @return
     * @throws URISyntaxException
     */
    @Override
    public Boolean persistWeatherInfo(String cityId, String token) throws URISyntaxException {
        String apiUrl = Url + "?id=" + cityId + "&appid=" + token;
        return saveWeatherInfo(getCityWeatherInfo(apiUrl));
        //return Boolean.TRUE;
    }

    /**
     * gets the Weather Details from Weather Info API.
     * @param apiUrl
     * @return
     * @throws URISyntaxException
     */
    private WeatherData getCityWeatherInfo(String apiUrl) throws URISyntaxException,ServiceUnavailableException {
        ResponseEntity<WeatherData> weatherData = null;
        try {
            URI uri = new URI(apiUrl);
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity<String> entity = new HttpEntity<String>(headers);
            weatherData = restTemplate.exchange(uri, HttpMethod.GET, entity
                    , WeatherData.class);
        } catch (Exception ex){
            log.error("Problem contacting Weather API.", ex);
            throw new ServiceUnavailableException("Weather API Service is unavailable.");
        }
        return weatherData.getBody();
    }

    /**
     * Saves Weather Info to Database.
     * @param weatherData
     * @return
     */
    @Transactional
    private Boolean saveWeatherInfo(WeatherData weatherData) {
        if (Objects.isNull(weatherData))
            return Boolean.FALSE;
        //Building Weather Info Entity Object.
        try {
            WeatherInfo weatherInfo = new WeatherInfo();
            weatherInfo.setCityId(weatherData.getId());
            weatherInfo.setCityName(weatherData.getName());
            weatherInfo.setCountryName(weatherData.getSys().getCountry());
            weatherInfo.setCreatedDate(LocalDateTime.now());
            weatherInfo.setHumidity(weatherData.getMain().getHumidity());
            weatherInfo.setPressure(weatherData.getMain().getPressure());
            weatherInfo.setTemp(weatherData.getMain().getTemp());
            weatherInfo.setTempMin(weatherData.getMain().getTempMin());
            weatherInfo.setTempMax(weatherData.getMain().getTempMax());
            weatherInfo.setMain(weatherData.getWeather().get(0).getMain());
            weatherInfo.setWeatherDescription(weatherData.getWeather().get(0).getDescription());

            weatherInfoRepository.save(weatherInfo);
            return Boolean.TRUE;
        } catch(Exception ex) {
            log.error("Saving Weather Info to Database has failed with error: " + ex);
            return Boolean.FALSE;
        }
    }
}
