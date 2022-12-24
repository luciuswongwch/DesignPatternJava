package com.luciuswong.behavioral.iterator;


public interface Iterator<T> {
    boolean hasNext();
    T next();
}