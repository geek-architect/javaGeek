package com.geekarchitect.javageek.generic2.demo02;

public class Tuple3<T, U, V> extends Tuple2<T, U> {
    private V third;

    public Tuple3(T first, U second, V third) {
        super(first, second);
        this.third = third;
    }

    public V getThird() {
        return third;
    }

    public void setThird(V third) {
        this.third = third;
    }
}
