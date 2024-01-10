package com.geekarchitect.javageek.module003.demo03;

import com.geekarchitect.javageek.module003.demo01.SKU;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/2/6
 */
@FunctionalInterface
public interface OversellV2<T>{
    boolean hasOversell(T t);
}
