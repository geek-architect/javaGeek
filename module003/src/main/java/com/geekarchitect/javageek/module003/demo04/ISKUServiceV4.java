package com.geekarchitect.javageek.module003.demo04;

import com.geekarchitect.javageek.module003.demo03.OversellV2;
import com.geekarchitect.javageek.module003.demo03.SKUV3;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/1/16
 */
public interface ISKUServiceV4 {
    int oversellCount(List<SKUV3> sourceSkuList, Predicate<SKUV3> predicate);
}
