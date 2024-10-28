package com.manjunath.dotikol.mergeInterval;

public class Interval {

    private int start;
    private int end;
    private boolean closed;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
        this.closed = true;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
