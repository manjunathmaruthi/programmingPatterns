package com.manjunath.dotikol.mergeInterval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval2 {

    public static void main(String args[]) {
        List<Interval> inputIntervals = Arrays.asList(new Interval(1,2),
                new Interval(3,5), new Interval(6,7), new Interval(8,10), new Interval(12,16));

        Interval newInterval = new Interval(4,8);

        List<Interval> outPutIntervalList = new ArrayList<>();
        int i = 0;
        int n = inputIntervals.size();

        while(i < n && inputIntervals.get(i).getStart() < newInterval.getStart()) {
            outPutIntervalList.add(new Interval(inputIntervals.get(i).getStart(), inputIntervals.get(i).getEnd()));
            i++;
        }

        if(outPutIntervalList.size() == 0 || outPutIntervalList.get(outPutIntervalList.size()-1).getEnd() > newInterval.getEnd()) {
            outPutIntervalList.add(newInterval);
        } else {
            outPutIntervalList.get(outPutIntervalList.size()-1).setEnd(Math.max(outPutIntervalList.get(outPutIntervalList.size()-1).getEnd(), newInterval.getEnd()));
        }


        while(i < n) {
            Interval lastInterval = outPutIntervalList.get(outPutIntervalList.size()-1);
            if(inputIntervals.get(i).getStart() <= lastInterval.getEnd()) {
                lastInterval.setEnd(Math.max(inputIntervals.get(i).getEnd(), lastInterval.getEnd()));
            } else {
                outPutIntervalList.add(new Interval(inputIntervals.get(i).getStart(), inputIntervals.get(i).getEnd()));
            }
            i++;
        }

        //Display output Intervals
        outPutIntervalList.stream().forEach(System.out::println);
    }
}
