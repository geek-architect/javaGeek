package com.geekarchitect.javageek.module002.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/1/16
 */
@Service
public class SKUService implements ISKUService {
    private static final Logger LOG = LoggerFactory.getLogger(SKUService.class);

    public List<SKU> filterSKUByStrategy(List<SKU> sourceSkuList,
                                         Predicate<SKU> skuPredicate) {
        List<SKU> filteredSkuList = new ArrayList<>();
        for (SKU sku : sourceSkuList) {
            if (skuPredicate.test(sku)) {
                filteredSkuList.add(sku);
            }
        }
        return filteredSkuList;
    }
}
