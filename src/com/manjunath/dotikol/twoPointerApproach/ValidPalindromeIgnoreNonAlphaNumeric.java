package com.manjunath.dotikol.twoPointerApproach;

public class ValidPalindromeIgnoreNonAlphaNumeric {

    public static void main(String args[]) {
        String str = "ab3 Gh h:g;6 3ba";

        if(str==null || str.isEmpty()) {
            return;
        }

        str = str.toLowerCase();
        boolean result = isValidPalindromeIgnoreNonAlphaNumeric(str);
        System.out.println(result);
    }

    private static boolean isValidPalindromeIgnoreNonAlphaNumeric(String str) {

        int p1 = 0;
        int p2 = str.length() - 1;

        while(p1 < p2){

            if(isCharNonAlphaNumeric(str.charAt(p1))){
                p1++;
                continue;
            }

            if(isCharNonAlphaNumeric(str.charAt(p2))){
                p2--;
                continue;
            }

            if(str.charAt(p1) == str.charAt(p2)) {
                p1++;
                p2--;
                continue;
            }

            if(str.charAt(p1) != str.charAt(p2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isCharNonAlphaNumeric(char ch) {
        return !((ch >= 'a' && ch <= 'z')
                || (ch >='0' && ch <= '9'));
    }
}
