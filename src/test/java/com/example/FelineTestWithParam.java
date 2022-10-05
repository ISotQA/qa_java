package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.ParameterizedType;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineTestWithParam {
    private int kittensCount;
    private int expectedCount;

    public FelineTestWithParam(int kittensCount, int expectedCount) {
        this.kittensCount = kittensCount;
        this.expectedCount = expectedCount;
    }

    @Parameterized.Parameters
    public static Object[] getKittensCountParam() {
        return new Object[][]{
                {1, 1},
                {100, 100},
                {500, 500}
        };
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        assertEquals(expectedCount, feline.getKittens(kittensCount));
    }
}