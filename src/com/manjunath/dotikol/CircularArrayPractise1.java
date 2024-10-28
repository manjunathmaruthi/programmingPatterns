package com.manjunath.dotikol;

public class CircularArrayPractise1 {

    public static void main(String[] args) {
        int arr[] = {9, 4, 7, 1, -2, 6, 5};
        int k = 2;
        int p1 = 0;
        int p2 = arr.length - 1;
        //step 1: Reverse array
        reverseArray(arr, p1, p2);

        //step 2: Reverse first k elements
        reverseArray(arr,0, k-1);

        //step 3: Reverse leftover elements
        reverseArray(arr, k, arr.length-1);

        //print elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }


    public static void reverseArray(int[] arr, int p1, int p2) {
        while (p1 < p2) {
            int tmp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = tmp;
            p1++;
            p2--;
        }
    }
}
