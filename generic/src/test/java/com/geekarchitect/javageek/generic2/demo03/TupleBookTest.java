package com.geekarchitect.javageek.generic2.demo03;

import com.geekarchitect.javageek.generic2.common.Book;
import com.geekarchitect.javageek.generic2.common.Phone;
import com.geekarchitect.javageek.generic2.common.PoetryBook;
import org.junit.jupiter.api.Test;

class TupleBookTest {
    @Test
    void test01() {
        PoetryBook poetryBook = new PoetryBook("1", "poetryBook", "a book about poetry", 10.0, "author1", "publisher1", null, 100, "style1");
        TupleBook<PoetryBook> tupleBook = new TupleBook<>(poetryBook);

        PoetryBook book = tupleBook.getElement();
        System.out.println(book.getName());
    }
    @Test
    void test02() {
        Book book=new Book("1", "book", "a book", 10.0, "author1", "publisher1", null, 100);
        //报编译时错误,因为book不是Book的子类
        //TupleBook<book> tupleBook = new TupleBook<>(book);

        //报编译时错误
        Phone phone = new Phone("1", "phone", "a phone", 1000.0, "brand1", "model1", "color1", 1);
        //TupleBook<phone> tupleBook = new TupleBook<>(phone);

    }
}