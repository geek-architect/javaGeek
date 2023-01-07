package com.geekarchitect.javageek.module001.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/12/29
 */
public class SKUServiceV3 {
    private static final Logger LOG = LoggerFactory.getLogger(SKUServiceV2.class);

    public static boolean isLaptop(SKU sku) {
        return sku.getCategoryName().equals("笔记本");
    }

    public static boolean isPriceGreaterThan(SKU sku) {
        return sku.getPrice() > 10000D;
    }

    public List<SKU> filterSKUByStrategy(List<SKU> sourceSkuList, SKUFilterStrategy skuFilterStrategy) {
        List<SKU> filteredSkuList = new ArrayList<>();
        for (SKU sku : sourceSkuList) {
            if (skuFilterStrategy.filter(sku)) {
                filteredSkuList.add(sku);
            }
        }
        return filteredSkuList;
    }
}


