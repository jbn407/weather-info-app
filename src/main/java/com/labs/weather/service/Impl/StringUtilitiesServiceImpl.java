package com.labs.weather.service.Impl;

import com.labs.weather.service.StringUtilitiesService;
/*
This class provides the string utilities:
    1. Verification if a given string is a Palindrome.
    2. Facilitates Reversing of a given string.
 */
public class StringUtilitiesServiceImpl implements StringUtilitiesService {
    /**
     * Method to verify if a given string is a Palindrome
     * @param strCheck
     * @return
     */
    @Override
    public Boolean isPalindrome(String strCheck) {
        String strReverse = getReverseString(strCheck);
        if(strCheck.equals(strReverse)){
            return Boolean.TRUE;
        }
        else
            return Boolean.FALSE;
    }

    /**
     * Reverses a given string
     * @param strReverse
     * @return
     */
    @Override
    public String getReverseString(String strReverse) {
        StringBuilder stringBuilder = new StringBuilder(strReverse);
        return stringBuilder.reverse().toString();
    }
}
