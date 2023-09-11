package com.geekarchitect.javageek.generic2.demo02;

public class Tuple<T> {
    private T element;

    public Tuple(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
