package com.manjunath.dotikol.recursion;

public class IncludeExcludePattern {

    public static void main(String args[]) {
        //String str = "abc";

        String num = "12";
        int number = num.charAt(0) - '0';
        System.out.println(number);

        int number2 = '0';
        System.out.println(number2);
/*
        int number = num.charAt(0) - '0';
        System.out.println(number);
        char str = (char) (number);
        System.out.println(str);

        System.out.println('0');
*/



       // include(str,0,"");
    }

    public static void include(String str, int index, String result) {

        if(index > str.length() - 1) {
            System.out.println(result);
            return;
        }

        include(str,index+1,result+str.charAt(index));
        System.out.println(result);

    }
}
