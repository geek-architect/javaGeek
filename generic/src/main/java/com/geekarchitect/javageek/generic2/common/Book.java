package com.geekarchitect.javageek.generic2.common;

import java.util.Date;

// 图书商品类
public class Book extends Product {
    private String author; // 作者
    private String publisher; // 出版社
    private Date publishDate; // 出版日期
    private int pageCount; // 页数

    /**
     * 图书类构造函数
     * @param id 图书ID
     * @param name 图书名称
     * @param description 图书描述
     * @param price 图书价格
     * @param author 作者
     * @param publisher 出版社
     * @param publishDate 出版日期
     * @param pageCount 页数
     */
    public Book(String id, String name, String description, double price, String author, String publisher, Date publishDate, int pageCount) {
        super(id, name, description, price);
        this.author = author;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.pageCount = pageCount;
    }
    //生成toString方法
    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishDate=" + publishDate +
                ", pageCount=" + pageCount +
                ", id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                '}';
    }

    /**
     * 获取作者
     * @return 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取出版社
     * @return 出版社
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * 设置出版社
     * @param publisher 出版社
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * 获取出版日期
     * @return 出版日期
     */
    public Date getPublishDate() {
        return publishDate;
    }

    /**
     * 设置出版日期
     * @param publishDate 出版日期
     */
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    /**
     * 获取页数
     * @return 页数
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * 设置页数
     * @param pageCount 页数
     */
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
