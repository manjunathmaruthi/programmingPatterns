package com.manjunath.dotikol.fastslowPractice1;

public class CircularArraySlowFastPractice1 {

    public static void main(String args[]) {
        int num[] = {1,3,-2,-4,-1};

        int slow = 0;
        int fast = 0;
        boolean forward = false;
        for(int i=0; i<num.length; i++) {
            slow = i;
            fast = i;
            forward = num[slow] > 0;
            while(true) {

                slow = movePointer(slow, num);
                if (!(forward == num[slow] > 0) || (Math.abs(num[slow] % num.length) == 0)) {
                    break;
                }

                fast = movePointer(fast, num);
                if (!(forward == num[fast] > 0)) {
                    break;
                }

                fast = movePointer(fast, num);
                if (!(forward == num[fast] > 0)) {
                    break;
                }

                if (slow == fast) {
                    System.out.println("Found circular Array");
                    return;
                }
            }

        }
    }

    private static int movePointer(int pointer, int num[]) {
        pointer = (pointer + num[pointer]) % num.length;
        if(pointer < 0) {
            pointer = pointer + num.length;
        }
        return pointer;
    }
}
