package com.geekarchitect.javageek.generic2.demo03;

import com.geekarchitect.javageek.generic2.common.Book;

class TupleBook<T extends Book> {
    private T element;

    public TupleBook(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
