package com.bridgelabz.userregistrationtest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class ValidLastNameTest {

    public String email2Test;
    public boolean expectedResult;

    public ValidLastNameTest(String email, boolean expectedResult){
        this.email2Test = email;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {"Nishit Nalin", true},
                {"Nis", true},
                {"nishit", false},
                {"Nis", true},
                {"Nishit2", false},
                {"Nis&^%", false},
                {"Ni", false},
        });
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue(){
        UserRegistration register = new UserRegistration();
        boolean result = register.validateEmail(this.email2Test);
        Assert.assertEquals(this.expectedResult, result);
    }

}
