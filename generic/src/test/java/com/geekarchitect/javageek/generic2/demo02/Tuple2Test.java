package com.geekarchitect.javageek.generic2.demo02;

import com.geekarchitect.javageek.generic2.common.Book;
import org.junit.jupiter.api.Test;

import java.util.Date;

class Tuple2Test {
    @Test
    public void testGetFirst() {
        Book book = new Book("001", "Java Programming", "Learn Java programming", 99.99,
                "John Smith", "ABC Publishing", new Date(), 500);
        Tuple2<Book, Integer> tuple = new Tuple2<>(book, 5);
        Book book1 = tuple.getFirst();
        Integer quantity = tuple.getSecond();
        //打印book1和quantity的值
        System.out.println(book1);
        System.out.println(quantity);
    }

}