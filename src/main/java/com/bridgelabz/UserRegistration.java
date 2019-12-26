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

    public String analyserLastName(String userLastName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}");
        Matcher matcher = pattern.matcher(userLastName);
        if (matcher.matches())
            return userLastName;
        return "Invalid";
    }

    public String analyseMailId(String mailId) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]{1,}([.]{1})?[0-9a-zA-Z]*[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-zA-Z]{2,4}([.]{1})?([a-zA-Z]{2,3})?$");
        Matcher matcher = pattern.matcher(mailId);
        if (matcher.matches())
            return "valid";
        return "Invalid";
    }

    public String analyseMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile("^[0-9]{2}[ ][0-9]{10}");
        Matcher matcher = pattern.matcher(mobileNumber);
        if (matcher.matches())
            return mobileNumber;
        return "Invalid";
    }

    public String analysePassWord(String passWord) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.[@!+]{1}).{8,}");
        Matcher matcher = pattern.matcher(passWord);
        if (matcher.matches())
            return passWord;
        return "Invalid";
    }
}
