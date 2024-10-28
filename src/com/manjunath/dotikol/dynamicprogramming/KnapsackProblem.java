package com.manjunath.dotikol.dynamicprogramming;

import java.util.Arrays;

public class KnapsackProblem {

    public static void main(String args[]) {
        int wt[] = {1,3,4,5};
        int val[] = {1,4,5,7};
        int w= 7;
        int n = wt.length;
        int t[][] = new int[n+1][w+1];
        Arrays.stream(t).forEach(row-> Arrays.fill(row, -1));
        int result = knapsack(wt, val, w, n, t);
        System.out.println(result);
    }

    public static int knapsack(int[] wt, int[] val, int w, int n, int[][] t) {
        //Base condition
        if(n==0 || w ==0) {
            return 0;
        }
        if(t[n][w] != -1) {
            return t[n][w];
        }

        if(wt[n-1] <= w) {
            return t[n][w] = Math.max(
                    val[n-1] + knapsack(wt, val, w-wt[n-1], n-1, t),
                    knapsack(wt, val, w, n-1, t)
            );
        } else {
            return t[n][w] = knapsack(wt, val, w, n-1, t);
        }
    }
}
