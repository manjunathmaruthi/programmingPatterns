package com.manjunath.dotikol.mergeInterval;

import java.util.ArrayList;
import java.util.List;

public class MergeOverlappingInterval {

    public static void main(String args[]) {

        //create input list of intervals
        List<Interval> inputIntervalsList = new ArrayList<>();
        Interval interval1 = new Interval(1,5);
        Interval interval2 = new Interval(3,7);
        Interval interval3 = new Interval(9,11);
        Interval interval4 = new Interval(12,14);

        inputIntervalsList.add(interval1);
        inputIntervalsList.add(interval2);
        inputIntervalsList.add(interval3);
        inputIntervalsList.add(interval4);

        List<Interval> mergedIntervals = mergeIntervals(inputIntervalsList);

        //Display Merged Intervals
        mergedIntervals.stream()
                .forEach((interval)-> System.out.print("["+interval.getStart()+" "+interval.getEnd()+"] "));

    }

    private static List<Interval> mergeIntervals(List<Interval> inputIntervalsList) {
        List<Interval> outputIntervals = new ArrayList<>();

        outputIntervals.add(inputIntervalsList.get(0));

        Interval lastOutputInterval = outputIntervals.get(outputIntervals.size()-1);
        for(int i = 1; i<inputIntervalsList.size(); i++) {
            Interval mergedInterval = null;
            //Does it overlaps ?
            if(lastOutputInterval.getEnd() > inputIntervalsList.get(i).getStart()) {
                //outputIntervals.add(inputInterval);
                lastOutputInterval.setEnd(Math.max(inputIntervalsList.get(i).getEnd(), lastOutputInterval.getEnd()));
            } else {
                outputIntervals.add(inputIntervalsList.get(i));
            }
        }
        return outputIntervals;
    }
}
