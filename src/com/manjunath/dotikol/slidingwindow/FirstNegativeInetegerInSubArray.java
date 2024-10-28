package com.manjunath.dotikol.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeInetegerInSubArray {

    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28,-2,3,6,9};
        int k = 3;

        int start = 0;
        int end = 0;

        List<Integer> result = new ArrayList<>();

        List<Integer> mainResult = new ArrayList<>();

        while (end < arr.length) {

            if (arr[end] < 0) { //store the result
                result.add(arr[end]);
            }

            if (end - start + 1 < k) {
                end++;
            } else if (end - start + 1 == k) {
                //Start: Calculation
                if (!result.isEmpty()) {
                    mainResult.add(result.get(0));
                }
                if (result.contains(arr[start])) {
                    result.remove(0);
                }
                //END: Calculation
                start++;
                end++;
            }
        }

        System.out.println(mainResult);
    }
}
