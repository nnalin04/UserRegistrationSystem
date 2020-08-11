package com.bridgelabz.userregistrationtest;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}([ ][A-Z]{1}[a-z]{2,})*";
    private static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[0-9a-zA-Z]{2,4}([.][a-zA-Z]{2})*$";

    public boolean registerName(String fname) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }

    public boolean registerEmail(String email){
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
}
