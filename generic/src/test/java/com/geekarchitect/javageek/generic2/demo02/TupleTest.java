package com.geekarchitect.javageek.generic2.demo02;

import com.geekarchitect.javageek.generic2.common.PoetryBook;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TupleTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void demo01() {
        Tuple<PoetryBook> poetryBookTuple = new Tuple<>(new PoetryBook( "1", "诗经", "中国第一本诗集", 100.0, "佚名", "中国出版社", null, 100, "诗经"));
        // 以下代码会编译错误, 因为泛型不支持协变,  即Tuple<PoetryBook>不是Tuple<Book>的子类
        //Tuple<Book> bookTuple = poetryBookTuple;
    }
}