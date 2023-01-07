package com.geekarchitect.javageek.module001.demo02;

import com.geekarchitect.javageek.module001.demo01.BaseTest;
import com.geekarchitect.javageek.module001.demo01.SKU;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

class SKUServiceV5Test extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SKUServiceV5Test.class);

    private SKUServiceV5 skuServiceV5;
    @BeforeEach
    void setUp() {
        skuServiceV5=new SKUServiceV5();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void consumerSKU() {
        LOG.info("Consumer接口案例");
        List<SKU> sourceSkuList = generatorSKU();
        skuServiceV5.consumerSKU(sourceSkuList,
                sku->LOG.info("name={} price={}",sku.getName(),sku.getPrice()));
    }
    @Test
    void consumerSKU02() {
        LOG.info("Consumer接口案例");
        List<SKU> sourceSkuList = generatorSKU();
        sourceSkuList.forEach(sku->LOG.info("name={} price={}",sku.getName(),sku.getPrice()));
    }

    @Test
    void functionSku() {
        LOG.info("Function接口案例");
        List<SKU> sourceSkuList = generatorSKU();
        LOG.info("源商品集合：数量={},商品={}", sourceSkuList.size(), sourceSkuList);
        List<String> filteredSkuList =skuServiceV5.functionSKU(sourceSkuList,
                sku->sku.getName());
        LOG.info("商品名称集合：数量={},商品名称={}", filteredSkuList.size(), filteredSkuList);
    }

    @Test
    void functionSku02() {
        LOG.info("Function接口案例-流操作");
        List<SKU> sourceSkuList = generatorSKU();
        LOG.info("源商品集合：数量={},商品={}", sourceSkuList.size(), sourceSkuList);
        List<String> filteredSkuList =sourceSkuList.stream().
                map(sku->sku.getName()).collect(Collectors.toList());
        LOG.info("商品名称集合：数量={},商品名称={}", filteredSkuList.size(), filteredSkuList);
    }
}