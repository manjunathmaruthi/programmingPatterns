package com.manjunath.dotikol.twoPointerApproach;

public class MergeTwoSortedArray {

    public static void main(String args[]) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {0, 2, 6, 8, 9};

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while (p1 < arr1.length) {

            if (arr2[p2] < arr1[p1]) {
                int tmp = arr2[p2];
                arr2[p2] = arr1[p1];
                arr1[p1] = tmp;
                p1++;
                p3 = p2;
                while (p3 < arr2.length - 1 && arr2[p3] > arr2[p3 + 1]) {
                    int tmp2 = arr2[p3];
                    arr2[p3] = arr2[p3+1];
                    arr2[p3+1] = tmp2;
                    p3++;
                }
            }
        }

        //Print two array
        System.out.println("Array 1");
        for(int i=0; i<arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }

        System.out.println("Array 2");
        for(int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
