package com.manjunath.dotikol.duplicatenumber;

public class FindDuplicateNumbers {

    public static void main(String[] args) {
        int a[] = {2,10,4,1,15,3};

        for (int i=0; i < a.length; i++) {

            int indexdVal = Math.abs(a[i]) % a.length;

            if (indexdVal >= a.length) {
                System.out.println("Invalid number in array");
                return;
            }

            if (a[indexdVal] < 0) {
                System.out.println("Duplicate Number is: "+ indexdVal);
                return;
            }

            a[indexdVal] = -a[indexdVal];
        }
    }
}
