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
}
