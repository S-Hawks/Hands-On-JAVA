package com.example.junit5essentials;

public class MathUtils {
    public int add(int a , int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public int multiply(int a , int b){
        return a * b;
    }

    public int divide(int a, int b){
        return a/b;
    }
    public double computeCircleArea(double radius){

        return 3.14 * radius * radius;
    }
}
