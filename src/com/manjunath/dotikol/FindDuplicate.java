package com.manjunath.dotikol;

public class FindDuplicate {

    public static void main(String args[]) {
        int nums[] =    {1, 6, 3, 5, 1, 2, 7, 4};

        int duplicateNumber = findDuplicateNumber(nums);
        System.out.println(duplicateNumber);
    }

    private static int findDuplicateNumber(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];

        //Part -1

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast) {
                break;
            }
        }
        //Part -2
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}
