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
}
