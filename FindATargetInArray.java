package com.example.demo.codility2;

/**
 * mahsaa 1/16/2022
 */

public class FindATargetInArray {
    static int[] intArray = {1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 5, 6, 7, 8};//14

    public static void main(String[] args) {
        boolean s = solution(intArray, 9);
        System.out.println("RESULT : " + s);
    }

    private static boolean solution(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1/*14*/; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }
        if (A[0] != 1 || A[n - 1] != K)
            return false;
        else
            return true;
    }

}
