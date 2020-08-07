package com.labs.weather.service;

import org.springframework.stereotype.Service;
/*
Interface for String Utilities used in this project.
 */
@Service
public interface StringUtilitiesService {
    Boolean isPalindrome(String strCheck);
    String getReverseString(String strReverse);
}
