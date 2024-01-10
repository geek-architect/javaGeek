package com.geekarchitect.javageek.module003.demo03;

import com.geekarchitect.javageek.module003.demo01.SKU;
import com.geekarchitect.javageek.module003.demo02.SKUV2;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/1/16
 */
public interface ISKUServiceV3 {
    int oversellCount(List<SKUV3> sourceSkuList,OversellV2<SKUV3> oversellV2);
}
