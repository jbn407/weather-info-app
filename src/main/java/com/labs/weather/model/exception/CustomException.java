package com.labs.weather.model.exception;

import com.labs.weather.model.dto.ErrorWrapperDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import java.util.Date;
/*
Customised Exception to represent Service unavailability of Weather Info API
 */
@ControllerAdvice
public class CustomException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ServiceUnavailableException.class)
    public ResponseEntity<ErrorWrapperDto> handleServiceUnavailableException(ServiceUnavailableException exception) {
        ErrorWrapperDto errorWrapperDto = new ErrorWrapperDto();
        errorWrapperDto.setTimeStamp(new Date());
        errorWrapperDto.setMessage(exception.getMessage());
        return new ResponseEntity<>(errorWrapperDto, HttpStatus.SERVICE_UNAVAILABLE);
    }
}
