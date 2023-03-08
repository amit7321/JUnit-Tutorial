package com.junitTutorial.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyMathTest {

    @org.junit.jupiter.api.Test
    void sum() {
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[] {12, 344, 56, 43});

        assertEquals(455, result);
    }
}