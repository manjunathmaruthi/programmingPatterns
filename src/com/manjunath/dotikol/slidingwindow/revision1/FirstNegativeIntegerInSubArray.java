package com.manjunath.dotikol.slidingwindow.revision1;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeIntegerInSubArray {

    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28,-2,3,6,9};
        int k = 3;
        int start = 0;
        int end = 0;

        List<Integer> tmp = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        while (end < arr.length) {

            if (arr[end] < 0) {
                tmp.add(arr[end]);
            }

            if (end - start + 1 < k) {
                end++;
            } else if (end - start + 1 == k) {

                if (!tmp.isEmpty()) {
                    result.add(tmp.get(0));
                }
                if (tmp.contains(arr[start])) {
                    tmp.remove(0);
                }
                start++;
                end++;
            }
        }

        System.out.println(result);
    }
}
