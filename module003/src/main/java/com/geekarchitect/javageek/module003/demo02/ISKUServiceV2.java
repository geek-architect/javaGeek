package com.geekarchitect.javageek.module003.demo02;

import com.geekarchitect.javageek.module003.demo01.ISkuStock;
import com.geekarchitect.javageek.module003.demo01.SKU;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/1/16
 */
public interface ISKUServiceV2 {
    int oversellCount(List<SKUV2> sourceSkuList
                                  );
}
