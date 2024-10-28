package com.manjunath.dotikol.twoPointerApproach;

public class MoveZeroToEnd {

    public static void main(String args[]) {
        /// int nums[] = {0,0,0,1,0,0};

        int nums[] = {1,2,0,4,8,0};

         if(nums.length < 1) {
             return;
         }
         int slow = 0;
         int fast = 1;

         while(fast < nums.length) {

             if(nums[slow] == 0 && nums[fast] == 0) {
                 fast = fast + 1;
             } else {

                 if (nums[slow] != nums[fast] && nums[slow] == 0) {
                     int tmp = nums[slow];
                     nums[slow] = nums[fast];
                     nums[fast] = tmp;
                     slow = slow + 1;
                     fast = fast + 1;
                 }
             }
         }

         //print array
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+" ");
        }

    }
}
