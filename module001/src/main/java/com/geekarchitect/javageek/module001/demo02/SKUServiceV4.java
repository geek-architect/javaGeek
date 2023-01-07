package com.geekarchitect.javageek.module001.demo02;

import com.geekarchitect.javageek.module001.demo01.SKU;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


/**
 * @author 极客架构师@吴念
 * @createTime 2022/12/29
 */
public class SKUServiceV4 {
    private static final Logger LOG = LoggerFactory.getLogger(SKUServiceV4.class);

    public List<SKU> filterSKUByStrategy(List<SKU> sourceSkuList,
                                         Predicate<SKU> skuFilterStrategy) {
        List<SKU> filteredSkuList = new ArrayList<>();
        for (SKU sku : sourceSkuList) {
            if (skuFilterStrategy.test(sku)) {
                filteredSkuList.add(sku);
            }
        }
        return filteredSkuList;
    }
}
