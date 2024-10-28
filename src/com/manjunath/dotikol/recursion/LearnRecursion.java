package com.manjunath.dotikol.recursion;

public class LearnRecursion {

    public static void main(String args[]) {
        int n = 1;
        test(n);
    }

    private static int test(int n) {

        if(n>5){
            return 1;
        }
        test(n+1);
        int result = test(n+1);
        return result;
    }
}
