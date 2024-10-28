package com.manjunath.dotikol.mergeInterval;

import java.util.ArrayList;
import java.util.List;

public class MergeOverlappingInterval2 {

    public static void main(String args[]) {

        //create input list of intervals
        List<Interval> inputIntervalsList = new ArrayList<>();
        Interval interval1 = new Interval(1, 5);
        Interval interval2 = new Interval(3, 7);
        Interval interval3 = new Interval(9, 11);
        Interval interval4 = new Interval(12, 14);

        inputIntervalsList.add(interval1);
        inputIntervalsList.add(interval2);
        inputIntervalsList.add(interval3);
        inputIntervalsList.add(interval4);

        List<Interval> mergedIntervals = mergeIntervals(inputIntervalsList);

        //Display the result
        mergedIntervals.stream().forEach(interval -> System.out.println(interval));
    }

    private static List<Interval> mergeIntervals(List<Interval> inputIntervalsList) {

        if(inputIntervalsList == null || inputIntervalsList.isEmpty()) {
            System.out.println("Input Interval list is Null/Empty");
            return new ArrayList<>();
        }
        List<Interval> outPutIntervalList = new ArrayList<>();
        outPutIntervalList.add(new Interval(inputIntervalsList.get(0).getStart(), inputIntervalsList.get(0).getEnd()));
        int i = 1;
        int n = inputIntervalsList.size();

        while(i < n) {
            Interval outPutInterval = outPutIntervalList.get(outPutIntervalList.size() - 1);
            Interval currentInterval = inputIntervalsList.get(i);

            int currStat = currentInterval.getStart();
            int currEnd = currentInterval.getEnd();
            int prevEnd = outPutInterval.getEnd();

            if (currStat <= prevEnd) {
                outPutInterval.setEnd(Math.max(prevEnd, currEnd));
            } else {
                outPutIntervalList.add(new Interval(currStat, currEnd));
            }
            i++;
        }

        return outPutIntervalList;
    }
}
