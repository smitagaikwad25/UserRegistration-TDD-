package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public String analyserName(String userName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}");
        Matcher matcher = pattern.matcher(userName);
        if (matcher.matches())
            return userName;
        return "Invalid";
    }
}

