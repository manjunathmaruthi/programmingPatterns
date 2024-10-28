package com.manjunath.dotikol.recursion;

public class CharOccuranceRecursion {

    public static void main(String args[]) {
        String str = "abaacdaefaah";
        int first = Integer.MAX_VALUE;
        int last = Integer.MIN_VALUE;
        int index = 0;
        findOccurance(str,index,first,last);
    }

    private static void findOccurance(String str, int index, int first, int last) {

        if(index == str.length()) {
            System.out.println("Occurance of char first: "+first+" last:"+last);
            return;
        }

        if(str.charAt(index) == 'c') {
            first = Math.min(first, index);
            last = Math.max(last, index);
        }
        findOccurance(str,index+1,first,last);
    }
}
