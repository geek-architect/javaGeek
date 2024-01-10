package com.geekarchitect.javageek.module003.demo02;

import lombok.Data;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/12/29
 */
@Data
public class SKUV2 implements Oversell{
    private Long id;
    private String name;
    private Long categoryId;
    private String categoryName;
    private Double price;
    private Long shopId;
    private String shopName;
    private int sales;//销售量
    private int stock;//库存量

    public SKUV2() {
    }

    public SKUV2(Long id, String name, Long categoryId, String categoryName, Double price, Long shopId, String shopName, int sales, int stock) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.price = price;
        this.shopId = shopId;
        this.shopName = shopName;
        this.sales = sales;
        this.stock = stock;
    }

    @Override
    public boolean hasOversell(int stock, int sales) {
        return false;
    }
}
