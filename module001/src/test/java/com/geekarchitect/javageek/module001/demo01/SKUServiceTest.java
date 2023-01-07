package com.geekarchitect.javageek.module001.demo01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

class SKUServiceTest extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(SKUServiceTest.class);

    private SKUService skuService;

    @BeforeEach
    void setUp() {
        skuService = new SKUService();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void filterSKU_V1() {
        LOG.info("第一版：硬编码");
        List<SKU> sourceSkuList = generatorSKU();
        LOG.info("源商品集合：数量={},商品={}", sourceSkuList.size(), sourceSkuList);
        List<SKU> filteredSkuList = skuService.filterSKU_V1(sourceSkuList);
        LOG.info("已过滤商品集合：数量={},商品={}", filteredSkuList.size(), filteredSkuList);
    }

    @Test
    void filterSKU_V2() {
        LOG.info("第二版：内容参数化");
        List<SKU> sourceSkuList = generatorSKU();
        LOG.info("源商品集合：数量={},商品={}", sourceSkuList.size(), sourceSkuList);
        List<SKU> filteredSkuList = skuService.filterSKU_V2(sourceSkuList, "笔记本");
        LOG.info("已过滤商品集合：数量={},商品={}", filteredSkuList.size(), filteredSkuList);
    }

    @Test
    void filterSKU_V31() {
        List<SKU> sourceSkuList = generatorSKU();
        LOG.info("第三版：方案1，串行化的多条件过滤");
        LOG.info("源商品集合：数量={},商品={}", sourceSkuList.size(), sourceSkuList);
        List<SKU> filteredSkuList = skuService.filterSKU_V3_1(sourceSkuList,
                "笔记本", 10000D);
        LOG.info("已过滤商品集合：数量={},商品={}", filteredSkuList.size(), filteredSkuList);
    }

    @Test
    void filterSKU_V32() {
        List<SKU> sourceSkuList = generatorSKU();
        LOG.info("第三版：方案2，并行化的多条件过滤");
        LOG.info("源商品集合：数量={},商品={}", sourceSkuList.size(), sourceSkuList);
        List<SKU> filteredSkuList = skuService.filterSKU_V2(sourceSkuList, "笔记本");
        filteredSkuList = skuService.filterSKU_V3_2(filteredSkuList, 10000D);
        LOG.info("已过滤商品集合：数量={},商品={}", filteredSkuList.size(), filteredSkuList);
    }

}