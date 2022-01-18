package com.example.demo.codility2;

import java.lang.Integer;

public class TwoDigitsSumValue {
    static Integer[] intArray = {1, 1000, 80, -91};
    private static Integer sum = 0;

    public static void main(String[] args) {
        sum = solution(intArray);

        System.out.println("intArray two digits sum value is: " + sum);
    }

    public static Integer solution(Integer[] inputArray) {
        for (Integer i : inputArray) {
            if (Math.abs(i) > 9 && Math.abs(i) < 100) {
                sum += i;
            }
        }
        return sum;
    }
}
