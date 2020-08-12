package com.bridgelabz.userregistrationtest;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        UserRegistration register = new UserRegistration();
        boolean result = register.validateName("Nishit Nalin");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse(){
        UserRegistration register = new UserRegistration();
        boolean result = register.validateName("Nt");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        UserRegistration register = new UserRegistration();
        boolean result = register.validateName("Srivastava");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse(){
        UserRegistration register = new UserRegistration();
        boolean result = register.validateName("Ns");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue(){
        UserRegistration register = new UserRegistration();
        boolean result = register.validateEmail("abc@gamil.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenShort_ShouldReturnFalse(){
        UserRegistration register = new UserRegistration();
        boolean result = register.validateEmail("@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue(){
        UserRegistration register = new UserRegistration();
        boolean result = register.validateMobileNumber("91 8937659775");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenShort_ShouldReturnFalse(){
        UserRegistration register = new UserRegistration();
        boolean result = register.validateMobileNumber("3523423");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue(){
        UserRegistration register = new UserRegistration();
        boolean result = register.validatePassword("AVCDER123s&^$*df");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenShort_ShouldReturnFalse(){
        UserRegistration register = new UserRegistration();
        boolean result = register.validatePassword("secAs");
        Assert.assertFalse(result);
    }
}
