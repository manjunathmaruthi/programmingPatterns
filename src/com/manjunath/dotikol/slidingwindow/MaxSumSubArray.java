package com.manjunath.dotikol.slidingwindow;

public class MaxSumSubArray {

    public static void main(String[] args) {
        int arr[] = {2, 90, 7, 10};
        int k = 3;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        //calculate sum of first 3 elements
        int start = 0;
        int end = 0;

        while (end < arr.length) {
            sum = sum + arr[end];
            if (end - start + 1 < k) {
                end++;
               continue;
            } else if (end - start + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                sum = sum - arr[start];
                start++;
                end++;
            }


        }

        System.out.println(maxSum);
    }

}
