package com.geekarchitect.javageek.generic2.common;

import java.util.Date;

public class PoetryBook extends Book {
    private String style; // 诗歌风格

    /**
     * 诗歌书籍类构造函数
     * @param id 书籍ID
     * @param name 书籍名称
     * @param description 书籍描述
     * @param price 书籍价格
     * @param author 作者
     * @param publisher 出版社
     * @param publishDate 出版日期
     * @param pageCount 页数
     * @param style 诗歌风格
     */
    public PoetryBook(String id, String name, String description, double price, String author, String publisher, Date publishDate, int pageCount, String style) {
        super(id, name, description, price, author, publisher, publishDate, pageCount);
        this.style = style;
    }

    /**
     * 获取诗歌风格
     * @return 诗歌风格
     */
    public String getStyle() {
        return style;
    }

    /**
     * 设置诗歌风格
     * @param style 诗歌风格
     */
    public void setStyle(String style) {
        this.style = style;
    }
}

