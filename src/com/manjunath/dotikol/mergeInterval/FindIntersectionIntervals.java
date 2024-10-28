package com.manjunath.dotikol.mergeInterval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionIntervals {

    public static void main(String args[]) {
        List<Interval> lista = Arrays.asList(new Interval(1, 4), new Interval(5, 6), new Interval(9, 15));
        List<Interval> listb = Arrays.asList(new Interval(2, 4), new Interval(5, 7), new Interval(9, 15));

    }

    // Function to find the intersecting points between two intervals
    public static List <Interval> intervalsIntersection(List <Interval> lista, List <Interval> listb) {
        List <Interval> intersections = new ArrayList<>(); // to store all intersecting intervals
        int n = lista.size();
        int m = listb.size();
        int i = 0;
        int j = 0;

        List<Interval> listc = new ArrayList<>();
        while(i < n && j < m) {

            if(lista.get(i).getStart() < listb.get(j).getStart()) {
                listc.add(new Interval(lista.get(i).getStart(), lista.get(i).getEnd()));
                i++;
            }

            if(lista.get(i).getStart() == listb.get(j).getStart()) {
                if(lista.get(i).getEnd() <= listb.get(i).getEnd()) {
                    listc.add(new Interval(lista.get(i).getStart(),lista.get(i).getEnd()));
                    i++;
                } else {
                    listc.add(new Interval(listb.get(i).getStart(), listb.get(i).getEnd()));
                }
            }
        }

        return intersections;
    }
}
