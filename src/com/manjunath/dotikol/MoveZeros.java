package com.manjunath.dotikol;

public class MoveZeros {

    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        moveZeroes(nums);
        for (int i=0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public static void moveZeroes(int[] nums) {

        int p1 = 0;
        int p2 = 0;

        while (p2 < nums.length) {

            if (nums[p2] !=0 ) {
                int tmp = nums[p2];
                nums[p2] = nums[p1];
                nums[p1] = tmp;
                p1++;
            }
            p2++;
        }

    }
}
