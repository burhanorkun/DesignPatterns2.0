package com.orkun.mydp.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
