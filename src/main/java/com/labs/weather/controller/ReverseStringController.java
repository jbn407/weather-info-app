package com.labs.weather.controller;

import com.labs.weather.service.Impl.StringUtilitiesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.constraints.NotNull;
/*
Controller class to support the REST endpoint for reversing a string.
 */
@RestController
@RequestMapping(value = "/stringutils")
public class ReverseStringController {
    @Autowired
    StringUtilitiesServiceImpl stringUtilitiesServiceImpl;
    @GetMapping("/reversestring")
    public String isPalindrom(@RequestParam(name = "value") @NotNull String strReverse) {
        if (StringUtils.isEmpty(strReverse))
            return "Error: Please pass a value.";
        return stringUtilitiesServiceImpl.getReverseString(strReverse);
    }
}
