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
public class ValidEmailTest {

    public String email2Test;
    public boolean expectedResult;

    public ValidEmailTest(String email, boolean expectedResult){
        this.email2Test = email;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com",true},
                {"abc-100@yahoo.com",true},
                {"abc.100@yahoo.com",false},
                {"abc111@abc.com",true},
                {"abc-100@abc.net",true},
                {"abc.100@abc.com.au", false},
                {"abc@1.com",true},
                {"abc@gmail.com.com",false},
                {"abc+100@gmail.com",false}
        });
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue(){
        UserRegistration register = new UserRegistration();
        boolean result = register.registerEmail(this.email2Test);
        Assert.assertEquals(this.expectedResult,result);
    }

}
