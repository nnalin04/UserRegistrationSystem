package com.bridgelabz.userregistrationtest;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}([ ][A-Z]{1}[a-z]{2,})*";
    private static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[0-9a-zA-Z]{2,4}([.][a-zA-Z]{2})*$";
    private static final String MOBILE_NUMBER_PATTERN = "^([1-9]{1}([-][1-9]{1}[0-9]{1,2}||[0-9]{1,3})) {1}[1-9]{1}[0-9]{9}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z].*)(?=.*[0-9].*)[0-9a-zA-Z!@#$%^&*+]{8,}$";


    public boolean registerName(String fname) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }

    public boolean registerEmail(String email){
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }

    public boolean registerMobileNumber(String number){
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        return pattern.matcher(number).matches();
    }

    public boolean validatePassword(String password){
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
}
