package com.geekarchitect.javageek.generic2.demo01;

import com.geekarchitect.javageek.generic2.common.Product;

public  class TupleProduct {
    private Product element;

    public TupleProduct(Product element) {
        this.element = element;
    }

    public Product getElement() {
        return element;
    }

    public void setElement(Product element) {
        this.element = element;
    }
}
