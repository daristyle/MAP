package org.domain;

public class Validator {
    public static boolean validate(String username){
        if (username.contains("_")){
            return false;
        }

        if (username.contains(" ")){
            return false;
        }

        return true;
    }
}
