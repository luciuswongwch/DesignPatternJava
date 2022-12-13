package com.luciuswong.singleresponsibility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    public boolean validateUser(User user) {
        if(!isPresent(user.getName()) || !isValidAlphaNumeric(user.getName())) {
            return false;
        }
        user.setName(user.getName().trim());

        if(!isPresent(user.getEmail()) || !isValidEmail(user.getEmail())) {
            return false;
        }
        user.setEmail(user.getEmail().trim());
        return true;
    }

    private boolean isPresent(String value) {
        return value != null && value.trim().length() > 0;
    }

    private boolean isValidAlphaNumeric(String value) {
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher = pattern.matcher(value.trim());
        return !matcher.find();
    }

    private boolean isValidEmail(String value) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(value.trim());
        return matcher.find();
    }
}
