package com.manjunath.dotikol.mergeInterval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeFreeTime {

    public static void main(String args[]) {
        List<List<List<Interval>>> inputs1 = Arrays.asList(
                Arrays.asList(
                        Arrays.asList(new Interval(1, 2), new Interval(5, 6)),
                        Arrays.asList(new Interval(1, 3)),
                        Arrays.asList(new Interval(4, 10))
                ));
        /**
         * [[[1,2], [5,6]],[[1,3],[4,10]]]
         */
        List<Interval> output1 = new ArrayList<>();
        System.out.println(inputs1.get(0).get(0).size());

        int i =0 ;

        while(i < inputs1.get(0).get(0).size()) {
            output1.add(inputs1.get(0).get(0).get(i));
        }


    }
}
