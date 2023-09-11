package com.geekarchitect.javageek.generic2.demo01;

import com.geekarchitect.javageek.generic2.common.Book;
import com.geekarchitect.javageek.generic2.demo02.Tuple;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class TupleTest {
    @Test
    public void testGetElement01() {
        Book book = new Book("001", "Java Programming", "Learn Java programming", 99.99,
                "John Smith", "ABC Publishing", new Date(), 500);
        //完整语法
        //Tuple<Book> tupleBook = new Tuple<Book>(book);
        //优化1：类型推断
        Tuple<Book> tupleBook = new Tuple<>(book);
        Book book1 = tupleBook.getElement();
        System.out.println(book1);
    }

    @Test
    public void testGetElement02() {
        Book book = new Book("001", "Java Programming", "Learn Java programming", 99.99,
                "John Smith", "ABC Publishing", new Date(), 500);
        //java10之后，可以使用var关键字
        var tupleBook = new Tuple<>(book);
        Book book1 = tupleBook.getElement();
        System.out.println(book1);
    }

}
