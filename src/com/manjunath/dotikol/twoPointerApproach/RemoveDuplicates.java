package com.manjunath.dotikol.twoPointerApproach;

public class RemoveDuplicates {

    public static void main(String args[]) {
        //int num[] = {1,3,3,3,6,7,7};
        int num[] = {3,3,3,1,1,1,1};

        if(num.length < 1) {
            return;
        }
        int slow = 0;
        int fast = 1;

        while(fast < num.length) {
            if(num[slow] != num[fast]) {
                num[slow + 1] = num[fast];
                slow = slow + 1;
            }
            fast = fast + 1;
        }

        System.out.println("New length: "+ (slow+1));
    }
}
