package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailTest {
    private String email;
    private String expectedResult;

    public EmailTest(String email, String expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{{"abc.abc@gmail.com.in", "valid"},
                {"abc@.com.in", "Invalid"},
                {"abc.abc@gmail.com.in", "valid"},
                {"abc.@gmail.com", "valid"}});
    }

    @Test
    public void givenEmailId_WhenProper_ShoudReturnValid() {
        UserRegistration userRegistration = new UserRegistration();
        String mailId = userRegistration.analyseMailId(email);
        Assert.assertEquals(expectedResult,mailId);
    }
}
