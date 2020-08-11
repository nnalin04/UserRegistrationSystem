package com.bridgelabz.userregistrationtest;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        UserRegistration register = new UserRegistration();
        boolean result = register.registerFirstName("Nishit");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnTrue(){
        UserRegistration register = new UserRegistration();
        boolean result = register.registerFirstName("Nt");
        Assert.assertEquals(false,result);
    }

}
