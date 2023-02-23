package com.junitTutorial.junit;

public class MyMath {

    int sum(int[] numbers){
        int x = 0 ;
        for(int i : numbers){
            x += i ;
        }
        return x ;
    }
}
