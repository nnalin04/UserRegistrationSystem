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
public class ValidFirstNameTest {

    public String firstName2Test;
    public boolean expectedResult;

    public ValidFirstNameTest(String firstName, boolean expectedResult){
        this.firstName2Test = firstName;
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
        boolean result = register.validateName(this.firstName2Test);
        Assert.assertEquals(this.expectedResult, result);
    }

}
