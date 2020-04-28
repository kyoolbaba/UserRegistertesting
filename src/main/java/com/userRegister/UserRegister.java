package com.userRegister;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegister {

    public boolean checkFirstName(String firstName) {
        Pattern pattern= Pattern.compile("[A-Z][a-z]{2,}");
        Matcher matcher= pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean checkLastName(String lastName) {
        Pattern pattern= Pattern.compile("[A-Z][a-z]{2,}");
        Matcher matcher= pattern.matcher(lastName);
        return matcher.matches();
    }

    public boolean checkEmailID(String emailID) {
        Pattern pattern= Pattern.compile("^[a-zA-Z0-9]+([.-_+])?[a-zA-Z0-9.-_=+]*@[a-zA-Z]+.[a-z]{2,4}(.[a-z]{2})?$");
        Matcher matcher= pattern.matcher(emailID);
        return matcher.matches();
    }
}
