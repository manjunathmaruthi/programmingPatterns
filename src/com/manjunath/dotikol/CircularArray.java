package com.manjunath.dotikol;

public class CircularArray {

    public static void main(String args[]) {
        int num[] = {1, 3, -2, -1, 5};

        boolean result = isCircularArray(num);
        System.out.println(result);

    }

    private static boolean isCircularArray(int[] num) {

        int slow = 0;
        int fast = 0;
        for (int i = 0; i < num.length; i++) {
            slow = i;
            fast = i;

            boolean forward = num[i] > 0;
            while (true) {
                //move slow pointer
                slow = movePointer(num, slow);

                //check for pointer moved is pointing to same type of integer or not
                //check for pointer moved pointing to the value which is equal to array length
                if (isCycleNotPossible(num, slow, forward)) break;

                //move fast pointer
                fast = movePointer(num, fast);
                //In case of negative integer we need to wrap around the value to be moved
                if (fast < 0) {
                    fast = fast + num.length;
                }

                if (isCycleNotPossible(num, fast, forward)) break;

                fast = movePointer(num, fast);

                if (isCycleNotPossible(num, fast, forward)) break;

                if (slow == fast) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isCycleNotPossible(int[] num, int pointer, boolean forward) {
        if (forward != num[pointer] > 0 || Math.abs(num[pointer]) % num.length == 0) {
            return true;
        }
        return false;
    }

    private static int movePointer(int[] num, int pointer) {
        pointer = (pointer + num[pointer]) % num.length;
        if (pointer < 0) {
            pointer = pointer + num.length;
        }
        return pointer;
    }
}
