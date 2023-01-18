package com.geekarchitect.javageek.module002.demo01;

import org.assertj.core.util.Lists;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/12/29
 */
public abstract class BaseTest {
    protected List<SKU> generatorSKU() {
        SKU sku01 = new SKU(1L, "华为MateBook X", 1L, "笔记本", 10000D, 1L, "华为旗舰专卖店", 1000, 10);
        SKU sku02 = new SKU(2L, "华为MateBook pro", 1L, "笔记本", 11000D, 1L, "华为旗舰专卖店", 50, 1000);
        SKU sku03 = new SKU(3L, "华为MateBook D", 1L, "笔记本", 12000D, 1L, "华为旗舰专卖店", 1000, 5);
        SKU sku04 = new SKU(4L, "HUAWEI Mate 50", 2L, "手机", 12000D, 1L, "华为旗舰专卖店", 20, 1000);
        SKU sku05 = new SKU(5L, "HUAWEI Mate 50 PRO", 2L, "手机", 12000D, 1L, "华为旗舰专卖店", 1000, 1000);
        SKU sku06 = new SKU(6L, "HUAWEI Mate 50E", 2L, "手机", 12000D, 1L, "华为旗舰专卖店", 1000, 1000);
        return Lists.newArrayList(sku01, sku02, sku03, sku04, sku05, sku06);
    }
}
