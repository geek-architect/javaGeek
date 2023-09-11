package com.geekarchitect.javageek.generic2.demo01;

import com.geekarchitect.javageek.generic2.common.Book;
import org.junit.jupiter.api.Test;

import java.util.Date;

class TupleProductTest {
    @Test
    public void testGetElement() {
        Book book = new Book("001", "Java Programming", "Learn Java programming", 99.99,
                "John Smith", "ABC Publishing", new Date(), 500);
        TupleProduct tupleProduct = new TupleProduct(book);
        // 通过强制类型转换，可以将Product类型的元素转换为Book类型
        Book book1 = (Book) tupleProduct.getElement();
        System.out.println(book1);
    }
}