package com.geekarchitect.javageek.generic2.demo02;

public class Tuple2<T, U> {
    private T first;
    private U second;

    public Tuple2(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }
}
