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

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue(){
        UserRegistration register = new UserRegistration();
        boolean result = register.registerEmail("abc@gamil.com");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenEmail_WhenShort_ShouldReturnTrue(){
        UserRegistration register = new UserRegistration();
        boolean result = register.registerEmail("@gmail.com");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue(){
        UserRegistration register = new UserRegistration();
        boolean result = register.registerMobileNumber("91 8937659775");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenMobileNumber_WhenShort_ShouldReturnTrue(){
        UserRegistration register = new UserRegistration();
        boolean result = register.registerMobileNumber("3523423");
        Assert.assertEquals(false,result);
    }

}
