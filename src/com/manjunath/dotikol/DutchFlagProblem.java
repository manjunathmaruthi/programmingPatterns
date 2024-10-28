package com.manjunath.dotikol;

public class DutchFlagProblem {

    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 0, 1, 2};
        sortColors(nums);

        for (int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public static void sortColors(int[] nums) {
        int zeroIndex = 0, twoIndex = nums.length - 1, i = 0;
        while( i <= twoIndex ) {
            if( nums[i] == 0 )
                swap(nums, zeroIndex++, i++);
            else if( nums[i] == 2)
                swap(nums, twoIndex--, i);
            else
                i++;
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
