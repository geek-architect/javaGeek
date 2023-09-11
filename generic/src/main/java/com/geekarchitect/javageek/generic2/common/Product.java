package com.geekarchitect.javageek.generic2.common;

public abstract class Product {
    private String id; // 商品ID
    private String name; // 商品名称
    private String description; // 商品描述
    private double price; // 商品价格

    /**
     * 商品类构造函数
     * @param id 商品ID
     * @param name 商品名称
     * @param description 商品描述
     * @param price 商品价格
     */
    public Product(String id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
    //生成toString方法
    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name +
                ", description='" + description +
                ", price=" + price +
                '}';
    }

    /**
     * 获取商品ID
     * @return 商品ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置商品ID
     * @param id 商品ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取商品名称
     * @return 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名称
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取商品描述
     * @return 商品描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置商品描述
     * @param description 商品描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取商品价格
     * @return 商品价格
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置商品价格
     * @param price 商品价格
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
