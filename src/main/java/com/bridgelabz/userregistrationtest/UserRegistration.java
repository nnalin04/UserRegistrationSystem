package com.bridgelabz.userregistrationtest;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}([ ][A-Z]{1}[a-z]{2,})*";

    public boolean registerName(String fname) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }
}
