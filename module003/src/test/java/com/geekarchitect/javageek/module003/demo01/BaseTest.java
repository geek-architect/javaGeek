package com.geekarchitect.javageek.module003.demo01;

import com.geekarchitect.javageek.module003.demo02.SKUV2;
import com.geekarchitect.javageek.module003.demo03.SKUV3;
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

    protected List<SKUV2> generatorSKUV2() {
        SKUV2 sku01 = new SKUV2(1L, "华为MateBook X", 1L, "笔记本", 10000D, 1L, "华为旗舰专卖店", 1000, 10);
        SKUV2 sku02 = new SKUV2(2L, "华为MateBook pro", 1L, "笔记本", 11000D, 1L, "华为旗舰专卖店", 50, 1000);
        SKUV2 sku03 = new SKUV2(3L, "华为MateBook D", 1L, "笔记本", 12000D, 1L, "华为旗舰专卖店", 1000, 5);
        SKUV2 sku04 = new SKUV2(4L, "HUAWEI Mate 50", 2L, "手机", 12000D, 1L, "华为旗舰专卖店", 20, 1000);
        SKUV2 sku05 = new SKUV2(5L, "HUAWEI Mate 50 PRO", 2L, "手机", 12000D, 1L, "华为旗舰专卖店", 1000, 1000);
        SKUV2 sku06 = new SKUV2(6L, "HUAWEI Mate 50E", 2L, "手机", 12000D, 1L, "华为旗舰专卖店", 1000, 1000);
        return Lists.newArrayList(sku01, sku02, sku03, sku04, sku05, sku06);
    }
    protected List<SKUV3> generatorSKUV3() {
        SKUV3 sku01 = new SKUV3(1L, "华为MateBook X", 1L, "笔记本", 10000D, 1L, "华为旗舰专卖店", 1000, 10);
        SKUV3 sku02 = new SKUV3(2L, "华为MateBook pro", 1L, "笔记本", 11000D, 1L, "华为旗舰专卖店", 50, 1000);
        SKUV3 sku03 = new SKUV3(3L, "华为MateBook D", 1L, "笔记本", 12000D, 1L, "华为旗舰专卖店", 1000, 5);
        SKUV3 sku04 = new SKUV3(4L, "HUAWEI Mate 50", 2L, "手机", 12000D, 1L, "华为旗舰专卖店", 20, 1000);
        SKUV3 sku05 = new SKUV3(5L, "HUAWEI Mate 50 PRO", 2L, "手机", 12000D, 1L, "华为旗舰专卖店", 1000, 1000);
        SKUV3 sku06 = new SKUV3(6L, "HUAWEI Mate 50E", 2L, "手机", 12000D, 1L, "华为旗舰专卖店", 1000, 1000);
        return Lists.newArrayList(sku01, sku02, sku03, sku04, sku05, sku06);
    }
}
