package com.userRegister;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

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
        Pattern pattern= Pattern.compile("^[a-zA-Z0-9]+([.-_+])?[a-zA-Z0-9.-_=+]" +
                                          "*@[a-zA-Z]+.[a-z]{2,4}(.[a-z]{2})?$");
        Matcher matcher= pattern.matcher(emailID);
        return matcher.matches();
    }

    public boolean validateMobile(String mobile) {
        Pattern pattern= Pattern.compile("^((\\+)?91|0)?[6-9][0-9]{9}$");
        Matcher matcher= pattern.matcher(mobile);
        return matcher.matches();
    }

    public boolean validatePassword(String password) {
        int NO_OF_SPECIAL_CHARACTER=0;
        Pattern pattern= Pattern.compile("(?=.*[A-Z])(?=.*[0-9])[A-z0-9]{8,}");
        Matcher matcher= pattern.matcher(password);
        Pattern pattern1=Pattern.compile("[!@#$%^&*]");
        Matcher matcher1=pattern1.matcher(password);
        while(matcher1.find()){
            NO_OF_SPECIAL_CHARACTER++;
        }
        return NO_OF_SPECIAL_CHARACTER==1;
    }
}
