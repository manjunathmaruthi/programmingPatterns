package com.manjunath.dotikol;

import java.util.HashSet;
import java.util.Set;

public class FindRepeatingElementsInArray {

    public static void main(String[] args) {
        int[] arr1 = {9,4,7,1,-2,6,5};
        int[] arr2 = {7,1,-2};
        int[] arr3 = {10, 12};

        Set<Integer> elementsSet = new HashSet<>();

        for (int i = 0; i < arr1.length ; i++) {
            if (!elementsSet.contains(arr1[i])) {
                elementsSet.add(arr1[i]);
            }
        }

        boolean result = findDuplicateElements(arr3, elementsSet);
        System.out.println(result);

    }

    public static boolean findDuplicateElements(int[] arr2, Set<Integer> elementsSet) {
        for (int i = 0; i < arr2.length ; i++) {

            if (!elementsSet.contains(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}
