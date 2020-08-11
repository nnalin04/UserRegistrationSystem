package com.bridgelabz.userregistrationtest;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        UserRegistration register = new UserRegistration();
        boolean result = register.registerName("Nishit Nalin");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnTrue(){
        UserRegistration register = new UserRegistration();
        boolean result = register.registerName("Nt");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        UserRegistration register = new UserRegistration();
        boolean result = register.registerName("Srivastava");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnTrue(){
        UserRegistration register = new UserRegistration();
        boolean result = register.registerName("Ns");
        Assert.assertEquals(false,result);
    }

}
