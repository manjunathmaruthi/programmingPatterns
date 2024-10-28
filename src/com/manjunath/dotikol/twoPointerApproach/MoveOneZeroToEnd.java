package com.manjunath.dotikol.twoPointerApproach;

public class MoveOneZeroToEnd {

    public static void main(String args[]) {
        int a[] = {1, 2, 0, 4, 8, 9};

        int n = a.length;
        int i = 0;

        while (i < n) {
            if (a[i] != 0) {
                i++;
            } else {
                break;
            }

        }

        while (i < n - 1) {
            a[i] = a[i + 1];
            i++;
        }

        a[n - 1] = 0;

        for (int j = 0; j < n; j++) {
            System.out.print(a[j]);
        }
    }
}
