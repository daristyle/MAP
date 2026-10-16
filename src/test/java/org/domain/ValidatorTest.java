package org.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ValidatorTest {
    @Test
    public void isInvalidUnderscoreTest(){
        assertEquals(false, Validator.validate("Username_"));
        assertEquals(false, Validator.validate("_username"));
        assertEquals(false, Validator.validate("_______"));
        assertEquals(false, Validator.validate("user_name"));

        assertFalse(Validator.validate("_"));
    }

    @Test
    public void isInvalidSpaceTest(){
        assertFalse(Validator.validate("username "));
        assertFalse(Validator.validate(" username "));
        assertFalse(Validator.validate("user name "));
        assertFalse(Validator.validate("usern     ame "));
    }

    @Test
    public void isValidUsername(){
        assertTrue(Validator.validate("12312hwsd"));
        assertTrue(Validator.validate("asdsd12312hwsd"));
        assertTrue(Validator.validate("1ASDSD2312hwsd"));

    }
}
