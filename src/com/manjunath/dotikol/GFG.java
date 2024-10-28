package com.manjunath.dotikol;

import java.util.*;

class GFG {

    // Function to find maximum number of planes that can be stopped from landing
    static int maxPlanes(int[] A, int[] B) {
        // Set to store unique landing times
        Set<Integer> uniqueLandingTimes = new HashSet<>();

        // Iterate over each plane's landing time and interval
        for (int i = 0; i < A.length; i++) {
            // Calculate the time needed for current plane
            int requiredTime = (int) Math.ceil((double) A[i] / B[i]);
            // Add the calculated time to the set
            uniqueLandingTimes.add(requiredTime);
        }

        // Return the number of unique landing times
        return uniqueLandingTimes.size();
    }

    // Driver Code
    public static void main(String[] args) {
        int[] A = { 1, 3, 5, 4, 8 };
        int[] B = { 1, 2, 2, 4, 4 };
        System.out.println(maxPlanes(A, B)); // Output: 4
    }
}
