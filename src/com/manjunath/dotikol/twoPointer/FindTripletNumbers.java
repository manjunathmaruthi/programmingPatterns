package com.manjunath.dotikol.twoPointer;

import java.util.Arrays;

public class FindTripletNumbers {

    public static boolean findSumOfThree(int[] nums, int target) {
        int p1;
        int p2;
        int sum = 0;

        if (nums.length < 3) {
            System.out.println("Size of Array is less than 3");
            return false;
        }
        if (nums.length > 1000) {
            System.out.println("Size of Array is more than 1000");
            return false;
        }

        Arrays.sort(nums);

        if (nums[0] < -1000) {
            System.out.println("Number in array is less than -1000");
            return false;
        }

        if (nums[nums.length - 1] > 1000) {
            System.out.println("Number in array is more than 1000");
            return false;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            p1 = i + 1;
            p2 = nums.length - 1;

            while (p1 < p2) {
                sum = nums[i] + nums[p1] + nums[p2];

                if (sum == target) {
                    System.out.println(String.format("Found 3 number %d %d %d", nums[i], nums[p1], nums[p2]));
                    return true;
                }
                if (sum > target) {
                    p2--;
                }
                if (sum < target) {
                    p1++;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int[] nums = {3, 7, 1, 2, 8, 4, 5};
        int target = 20;
        findSumOfThree(nums, target);
    }
}
