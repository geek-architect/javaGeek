package com.geekarchitect.javageek.generic2.demo01;

import com.geekarchitect.javageek.generic2.common.Book;
import org.junit.jupiter.api.Test;

import java.util.Date;

class TupleBookTest {

    @Test
    public void testGetElement() {
        Book book = new Book("001", "Java Programming", "Learn Java programming", 99.99,
                "John Smith", "ABC Publishing", new Date(), 500);
        TupleBook tupleBook = new TupleBook(book);
        Book book1 = tupleBook.getElement();
        System.out.println(book1);
    }
}