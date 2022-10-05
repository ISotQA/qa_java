package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTestWithParam {
    private String sex;
    private boolean hasMane;

    public LionTestWithParam(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }


    @Parameterized.Parameters
    public static Object[][] doesHaveMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        boolean actualResult = lion.doesHaveMane();
        assertEquals(hasMane, actualResult);
    }
}