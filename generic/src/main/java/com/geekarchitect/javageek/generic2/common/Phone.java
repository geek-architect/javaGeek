package com.geekarchitect.javageek.generic2.common;

public class Phone extends Product {
    private String brand; // 品牌
    private String model; // 型号
    private String color; // 颜色
    private int storage; // 存储

    /**
     * 手机类构造函数
     * @param id 手机ID
     * @param name 手机名称
     * @param description 手机描述
     * @param price 手机价格
     * @param brand 品牌
     * @param model 型号
     * @param color 颜色
     * @param storage 存储
     */
    public Phone(String id, String name, String description, double price, String brand, String model, String color, int storage) {
        super(id, name, description, price);
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.storage = storage;
    }

    /**
     * 获取品牌
     * @return 品牌
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置品牌
     * @param brand 品牌
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取型号
     * @return 型号
     */
    public String getModel() {
        return model;
    }

    /**
     * 设置型号
     * @param model 型号
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 获取颜色
     * @return 颜色
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置颜色
     * @param color 颜色
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取存储
     * @return 存储
     */
    public int getStorage() {
        return storage;
    }

    /**
     * 设置存储
     * @param storage 存储
     */
    public void setStorage(int storage) {
        this.storage = storage;
    }
}

