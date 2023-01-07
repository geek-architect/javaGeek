package com.geekarchitect.javageek.module001.demo01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

class SKUServiceV3Test extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(SKUServiceV2Test.class);

    private SKUServiceV3 skuServiceV3;

    @BeforeEach
    void setUp() {
        this.skuServiceV3 = new SKUServiceV3();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void filterSKUByStrategy() {
        List<SKU> sourceSkuList = generatorSKU();
        LOG.info("第七版：基于Lambda表达式,方法引用的策略模式，");
        LOG.info("源商品集合：数量={},商品={}", sourceSkuList.size(), sourceSkuList);
        List<SKU> filteredSkuList = skuServiceV3.filterSKUByStrategy(sourceSkuList, SKUServiceV3::isLaptop);
        filteredSkuList = skuServiceV3.filterSKUByStrategy(filteredSkuList, SKUServiceV3::isPriceGreaterThan);
        LOG.info("已过滤商品集合：数量={},商品={}", filteredSkuList.size(), filteredSkuList);
    }
}