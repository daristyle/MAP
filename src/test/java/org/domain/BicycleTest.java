package org.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicycleTest {
    @Test
    public void isRedTest(){
        Bicycle red = new Bicycle(1, "ss", "Red");
        assertTrue(red.isRed());
    }
}