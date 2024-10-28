package com.manjunath.dotikol.twoPointerApproach;

public class RemoveDuplicates_1 {

    public static void main(String args[]) {
        int a[] = {1,1,1,2};
        int p1 = 0;
        int p2 = 1;
        int n = a.length;

        while(p2 < n) {
            if(a[p1] != a[p2]) {
                a[p1+1] = a[p2];
                p1++;
            }
            p2++;
        }
        System.out.println("Array new length: "+(p1+1));

    }
}
