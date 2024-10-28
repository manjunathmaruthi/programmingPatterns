package com.manjunath.dotikol.recursion;

public class SumOfNaturalNumbers {

    public static void main(String args[]) {
        int n = 5;
        int result = sumOfNaturalNumbers(n);
        System.out.println(result);
    }

    private static int sumOfNaturalNumbers(int n) {

        if (n == 1)
            return 1;

        return n + sumOfNaturalNumbers(n-1);
    }
}
