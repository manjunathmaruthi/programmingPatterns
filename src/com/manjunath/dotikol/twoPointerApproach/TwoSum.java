package com.manjunath.dotikol.twoPointerApproach;

import java.util.Arrays;

public class TwoSum {

    public static void main(String args[]) {
        //Input
        int num[] = {5, 2, 1, 0, 9};
        int targetSum = 11;

        int result[] = twoSum(num, targetSum);
        System.out.println(result[0]+" "+result[1]);
    }

    private static int[] twoSum(int[] num, int targetSum) {
        int result[] = new int[2];
        //sort the array
        Arrays.sort(num);
        if (num.length < 2) {
            System.out.println("Invalid array");
            return result;
        }
        int p1 = 0;
        int p2 = num.length - 1;
        int sum = 0;

        while (p1 < p2) {
            sum = num[p1] + num[p2];

            if (sum == targetSum) {
                result[0] = num[p1];
                result[1] = num[p2];
                return result;
            } else if (sum < targetSum) {
                p1++;
            } else {
                p2--;
            }
        }
        //Not found
        result[0] = -1;
        result[1] = -1;
        return result;
    }
}
