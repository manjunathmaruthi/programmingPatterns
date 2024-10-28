package com.manjunath.dotikol.recursion;

public class ReverseStrRecursion {

    public static void main(String args[]) {
        String str = "abcd";
        int index = 0;
        reverseStr(str, index);
    }

    private static void reverseStr(String str, int index) {

        if(index == str.length()) {
            return;
        }

        reverseStr(str,index+1);
        System.out.print(str.charAt(index));
    }
}
