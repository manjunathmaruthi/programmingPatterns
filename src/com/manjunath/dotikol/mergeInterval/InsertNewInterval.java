package com.manjunath.dotikol.mergeInterval;

import java.util.ArrayList;
import java.util.List;

public class InsertNewInterval {

    public static void main(String args[]) {
        List<Interval> inputIntervalsList = new ArrayList<>();
        Interval interval1 = new Interval(1,5);
        Interval interval2 = new Interval(3,7);
        Interval interval3 = new Interval(9,11);
        Interval interval4 = new Interval(12,14);

        inputIntervalsList.add(interval1);
        inputIntervalsList.add(interval2);
        inputIntervalsList.add(interval3);
        inputIntervalsList.add(interval4);

        Interval newInterval = new Interval(4,10);
        List<Interval> resultIntervals = insertInterval(inputIntervalsList, newInterval);
        resultIntervals.stream().forEach(interval -> System.out.println(interval));

    }

    private static List<Interval> insertInterval(List<Interval> inputIntervalsList, Interval newInterval) {

        List<Interval> outPutInterval = new ArrayList<>();

        for(int i=0; i<inputIntervalsList.size(); i++) {
            Interval currentInterval = inputIntervalsList.get(i);

            //New Interval overlaps with currentInterval
            if(newInterval.getStart() < currentInterval.getEnd()) {
                currentInterval.setStart(Math.min(currentInterval.getStart(), newInterval.getStart()));
                currentInterval.setEnd(Math.max(currentInterval.getEnd(), newInterval.getEnd()));
                outPutInterval.add(currentInterval);

                for(int j=i+1; j<inputIntervalsList.size(); j++) {
                    Interval curr = inputIntervalsList.get(j);
                    Interval last = outPutInterval.get(outPutInterval.size()-1);

                    if(curr.getStart() < last.getEnd()) {
                        last.setEnd(Math.max(curr.getEnd(), last.getEnd()));
                    } else {
                        outPutInterval.add(curr);
                    }
                }
                break;
            }

            outPutInterval.add(inputIntervalsList.get(i));
        }
        return outPutInterval;
    }
}
