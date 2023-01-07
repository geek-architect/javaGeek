package com.geekarchitect.javageek.module001.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/12/29
 */
public class SKUService {
    private static final Logger LOG = LoggerFactory.getLogger(SKUService.class);

    public List<SKU> filterSKU_V1(List<SKU> sourceSkuList) {
        List<SKU> filteredSkuList = new ArrayList<>();
        for (SKU sku : sourceSkuList) {
            if ("笔记本".equals(sku.getCategoryName())) {
                filteredSkuList.add(sku);
            }
        }
        return filteredSkuList;
    }

    public List<SKU> filterSKU_V2(List<SKU> sourceSkuList, String categoryName) {
        List<SKU> filteredSkuList = new ArrayList<>();
        for (SKU sku : sourceSkuList) {
            if (categoryName.equals(sku.getCategoryName())) {
                filteredSkuList.add(sku);
            }
        }
        return filteredSkuList;
    }

    public List<SKU> filterSKU_V3_1(List<SKU> sourceSkuList, String categoryName, Double price) {
        List<SKU> filteredSkuList = new ArrayList<>();
        for (SKU sku : sourceSkuList) {
            if (categoryName.equals(sku.getCategoryName()) && sku.getPrice() > price) {
                filteredSkuList.add(sku);
            }
        }
        return filteredSkuList;
    }

    public List<SKU> filterSKU_V3_2(List<SKU> sourceSkuList, Double price) {
        List<SKU> filteredSkuList = new ArrayList<>();
        for (SKU sku : sourceSkuList) {
            if (sku.getPrice() > price) {
                filteredSkuList.add(sku);
            }
        }
        return filteredSkuList;
    }
}
