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
Controller class to support the REST endpoint for Palindrome utilities.
 */
@RestController
@RequestMapping (value = "/stringutils")
public class PalindromeController {

    @Autowired
    StringUtilitiesServiceImpl stringUtilitiesServiceImpl;
    @GetMapping("/ispalindrome")
    public Boolean isPalindrome(@RequestParam(name = "value") @NotNull String strCheck) {
        if (StringUtils.isEmpty(strCheck))
            return Boolean.FALSE;
        return stringUtilitiesServiceImpl.isPalindrome(strCheck);
    }

}
