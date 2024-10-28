package com.manjunath.dotikol;

public class Solution {
    public static void main(String[] args) {
        int nums[] = {1,1,2};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }

    static int removeDuplicates(int[] nums) {

        if (nums.length < 2) {
            return 0;
        }

        int p1 = 0;

        for (int p2 = 1; p2 < nums.length; p2++) {

            if (nums[p1] != nums[p2]) {
                p1++;
                nums[p1] = nums[p2];

            }
        }

        return p1 + 1;

    }
}

