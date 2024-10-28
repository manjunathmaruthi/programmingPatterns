package com.manjunath.dotikol;

import java.util.Arrays;

public class HashingWithLinerProbing {

    public static void main(String[] args) {
        int[] elements = {25,35,15,45,55,65,75};

        int[] table = new int[10];

       //fill zero
        Arrays.fill(table, 0);

        int offSet = 1;

        for(int element : elements) {
            int index = getHashKeyUsingLinerProbing(element, elements.length, table, offSet);
            table[index] = element;
            System.out.println(index +" -> "+table[index]);
        }
    }


    public static int getHashKeyUsingLinerProbing(final int element, final int size, final int[] table, int offSet) {

        int index = element % 5;

        while (table[index] != 0) {
            index = (index + offSet) % size;
        }
        return index;
    }
}
