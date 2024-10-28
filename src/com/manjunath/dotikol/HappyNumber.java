package com.manjunath.dotikol;

public class HappyNumber {

    public static void main(String args[]) {
        int number = 4;

        int slowPointer = number;
        int fastPointer = checkHappyNumber(number);

        while (fastPointer != 1 && slowPointer != fastPointer) {
            slowPointer = checkHappyNumber(slowPointer);
            fastPointer = checkHappyNumber(checkHappyNumber(fastPointer));
            System.out.print(slowPointer+"-->");
            System.out.print(fastPointer+"-->");
        }
        System.out.println(fastPointer == 1);
    }

    private static int checkHappyNumber(int number) {
        int sumDigit = 0;
        while (number > 0) {
            int digit = number % 10;
            sumDigit +=  Math.pow(digit, 2);
            number = number / 10;
        }
        return sumDigit;
    }

}
