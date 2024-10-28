package com.manjunath.dotikol.recursion;

public class SumOfTwoNumbers {

    public static void main(String args[]) {
        String str1 = "20";
        String str2 = "30";
        int i = str1.length()-1;
        int j = str2.length()-1;

        String result = "";
        sumOfTwoNumberInString(str1, str2,i,j,result, 0);


    }

    private static void sumOfTwoNumberInString(String str1, String str2, int i, int j, String result, int carry) {

        if(i<0 && j<0 && carry == 0) {
            StringBuilder result2 = new StringBuilder(result);
            System.out.println(result2.reverse());
            return;
        }
        int first = 0;
        int second = 0;
        if(i >= 0) {
            first = str1.charAt(i) - '0';
        }
        if(j >= 0) {
            second = str2.charAt(j) - '0';
        }

        int sum = first + second + carry;;
        carry = sum / 10;
        int lastdigit = sum % 10;
        result = result + lastdigit;
        sumOfTwoNumberInString(str1,str2,i-1,j-1,result,carry);
    }
}
