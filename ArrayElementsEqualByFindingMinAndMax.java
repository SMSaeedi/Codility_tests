package com.example.demo.codility2;

import java.util.Arrays;

/**
 * mahsaa 1/16/2022
 */

public class ArrayElementsEqualByFindingMinAndMax {
    static int[] intArray = {3, 2, 1, 1, 2, 3, 1};
    static int[] intArray1 = {4, 1, 4, 1};
    static int[] intArray2 = {3, 3, 3};

    public static void main(String[] args) {
        System.out.println(minCost(intArray));
        System.out.println(minCost(intArray1));
        System.out.println(minCost(intArray2));
    }

    static int minCost(int arr[]) {
        int cost = 0;
        Arrays.sort(arr);
        int n = arr.length;

        int K = arr[n / 2];

        for (int i = 0; i < n; ++i)
            cost += Math.abs(arr[i] - K);

        if (n % 2 == 0) {
            int tempCost = 0;

            K = arr[(n / 2) - 1];

            for (int i = 0; i < n; ++i)
                tempCost += Math.abs(arr[i] - K);

            cost = Math.min(cost, tempCost);
        }

        return cost;
    }
}