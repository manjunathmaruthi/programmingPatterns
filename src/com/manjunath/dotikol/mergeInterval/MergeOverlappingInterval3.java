package com.manjunath.dotikol.mergeInterval;

import java.util.ArrayList;
import java.util.List;

public class MergeOverlappingInterval3 {

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

    public static List <Interval> mergeIntervals(List<Interval> intervals) {
        if(intervals.size() == 1 || intervals.size() == 0) {
            return intervals;
        }
        List<Interval> newIntervalList = new ArrayList<>();
        newIntervalList.add(intervals.get(0));

        int size = intervals.size();

        for(int i=1; i<size; i++) {
            final Interval currentInterval = intervals.get(i);
            final Interval newInterval = newIntervalList.get(newIntervalList.size() - 1);

            if (currentInterval.getStart() <= newIntervalList.get(newIntervalList.size() - 1).getEnd()) {
                int newEndInterval = Math.max(currentInterval.getEnd(), newIntervalList.get(newIntervalList.size() - 1).getEnd());
                newInterval.setEnd(newEndInterval);
            } else {
                newIntervalList.add(new Interval(currentInterval.getStart(), currentInterval.getEnd()));
            }
        }

        // Replace this placeholder return statement with your code
        return newIntervalList;
    }
}
