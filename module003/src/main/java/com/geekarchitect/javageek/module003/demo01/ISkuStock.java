package com.geekarchitect.javageek.module003.demo01;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/1/30
 */
@FunctionalInterface
public interface ISkuStock<T> {
    int getStock(T t);
}
