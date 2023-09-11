package com.geekarchitect.javageek.generic2.demo01;

import com.geekarchitect.javageek.generic2.common.Book;

public class TupleBook {
    private Book element;

    public TupleBook(Book element) {
        this.element = element;
    }

    // 获取元素
    public Book getElement() {
        return element;
    }

    // 设置元素
    public void setElement(Book element) {
        this.element = element;
    }
}
