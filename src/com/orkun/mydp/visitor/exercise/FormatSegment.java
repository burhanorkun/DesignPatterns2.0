package com.orkun.mydp.visitor.exercise;

public class FormatSegment implements Segment {
    @Override
    public void applyFilter(AudioFilter filter) {
        filter.apply(this);
    }
}
