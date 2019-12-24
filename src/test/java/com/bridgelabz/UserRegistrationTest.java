package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenUserName_whenStartWithCapAndHasMinimumThreeChar_shouldReturnUsername() {
        UserRegistration userRegistration = new UserRegistration();
        String userName = userRegistration.analyserName("Smita");
        Assert.assertEquals("Smita",userName);
    }

    @Test
    public void givenUserName_WhenNotProper_ShouldReturnInvalid() {
        UserRegistration userRegistration = new UserRegistration();
        String userName = userRegistration.analyserName("smita");
        Assert.assertEquals("Invalid",userName);
    }

    @Test
    public void givenUserLastName_WhenStartWithCapAndHasMinimunThreeChar_ReturnUserLastName() {
        UserRegistration userRegistration = new UserRegistration();
        String userLastName = userRegistration.analyserLastName("Shinde");
        Assert.assertEquals("Shinde",userLastName);
    }

    @Test
    public void givenUserLastName_WhenNotProper_ShouldReturnInvalid() {
        UserRegistration userRegistration = new UserRegistration();
        String userLastName = userRegistration.analyserLastName("shinde");
        Assert.assertEquals("Invalid",userLastName);
    }

    @Test
    public void givenMailId_WhenProper_ShouldReturnMailId() {
        UserRegistration userRegistration = new UserRegistration();
        String mailId = userRegistration.analyseMailId("smita.shinde123@gmail.com.in");
        Assert.assertEquals("smita.shinde123@gmail.com.in",mailId);
    }

    @Test
    public void givenMailId_WhenNotProper_ShouldReturnInvalid() {
        UserRegistration userRegistration = new UserRegistration();
        String mailId = userRegistration.analyseMailId("smita@..com.in");
        Assert.assertEquals("Invalid",mailId);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnMobileNumber() {
        UserRegistration userRegistration = new UserRegistration();
        String mobileNumber = userRegistration.analyseMobileNumber("91 1234567891");
        Assert.assertEquals("91 1234567891",mobileNumber);
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnInvalid() {
        UserRegistration userRegistration = new UserRegistration();
        String mobileNumber = userRegistration.analyseMobileNumber("12345 12345");
        Assert.assertEquals("Invalid",mobileNumber);
    }

    @Test
    public void givenPassword_WhenHasMinimumEightChar_ShouldReturnPassword() {
        UserRegistration userRegistration = new UserRegistration();
        String passWord = userRegistration.analysePassWord("asdfghjkL");
        Assert.assertEquals("asdfghjkL",passWord);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnInvalid() {
        UserRegistration userRegistration = new UserRegistration();
        String passWord = userRegistration.analysePassWord("asd");
        Assert.assertEquals("Invalid",passWord);
    }
}
