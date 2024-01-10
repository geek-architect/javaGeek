package com.geekarchitect.javageek.module003.demo01;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/1/16
 */
public interface ISKUService {
    int stockCount(List<SKU> sourceSkuList,
                                  ISkuStock<SKU> getStock);
}
