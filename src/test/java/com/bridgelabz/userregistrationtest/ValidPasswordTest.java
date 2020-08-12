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
public class ValidPasswordTest {

    public String password2Test;
    public boolean expectedResult;

    public ValidPasswordTest(String password, boolean expectedResult){
        this.password2Test = password;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {"Abcd123@ksb", false},
                {"Abcd123#@", false},
                {"jdfblkudnsku", false},
                {"KDBFLFUKBA", false},
                {"JHkhb&*^%", false},
                {"kjhvKJHV75768", false},
                {"Aa!1", false},
        });
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue(){
        UserRegistration register = new UserRegistration();
        boolean result = register.validatePassword(this.password2Test);
        Assert.assertEquals(this.expectedResult, result);
    }

}
