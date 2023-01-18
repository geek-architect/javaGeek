package com.geekarchitect.javageek.module002.demo01;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/1/16
 */
public interface ISKUService {
    List<SKU> filterSKUByStrategy(List<SKU> sourceSkuList,
                                  Predicate<SKU> skuPredicate);
}
