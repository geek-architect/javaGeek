package com.geekarchitect.javageek.module001.demo02;

import com.geekarchitect.javageek.module001.demo01.BaseTest;
import com.geekarchitect.javageek.module001.demo01.SKU;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SKUServiceV4Test extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SKUServiceV4Test.class);

    private SKUServiceV4 skuServiceV4;
    @BeforeEach
    void setUp() {
        skuServiceV4=new SKUServiceV4();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void filterSKUByStrategy() {
        List<SKU> sourceSkuList = generatorSKU();
        LOG.info("第七版：基于Predicate接口和Lambda表达式的策略模式");
        LOG.info("源商品集合：数量={},商品={}", sourceSkuList.size(), sourceSkuList);
        List<SKU> filteredSkuList = skuServiceV4.filterSKUByStrategy(sourceSkuList,
                sku -> sku.getCategoryName().equals("笔记本"));
        filteredSkuList = skuServiceV4.filterSKUByStrategy(filteredSkuList,
                sku -> sku.getPrice() > 10000);
        LOG.info("已过滤商品集合：数量={},商品={}", filteredSkuList.size(), filteredSkuList);
    }
}