package com.geekarchitect.javageek.module003.demo03;

import com.geekarchitect.javageek.module003.demo02.Oversell;
import lombok.Data;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/12/29
 */
@Data
public class SKUV3{
    private Long id;
    private String name;
    private Long categoryId;
    private String categoryName;
    private Double price;
    private Long shopId;
    private String shopName;
    private int sales;//销售量
    private int stock;//库存量

    public SKUV3() {
    }

    public SKUV3(Long id, String name, Long categoryId, String categoryName, Double price, Long shopId, String shopName, int sales, int stock) {
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

    public boolean hasOversell() {
        return this.stock>this.sales;
    }
}
