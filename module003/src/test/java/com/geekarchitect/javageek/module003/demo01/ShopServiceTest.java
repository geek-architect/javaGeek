package com.geekarchitect.javageek.module003.demo01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class ShopServiceTest extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(ShopServiceTest.class);

    @Autowired
    private ISKUService skuService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void skuService() {
        List<SKU> sourceSKUList = generatorSKU();
        LOG.info("原始方法");
        int total=0;
        for(SKU sku:sourceSKUList){
            total+=sku.getStock();
        }
        LOG.info("商品数量：{}",total);
    }

    @Test
    void skuService1() {
        List<SKU> sourceSKUList = generatorSKU();
        LOG.info("基于Lambda表达式");
        int total=skuService.stockCount(sourceSKUList,(sku)->sku.getStock());
        LOG.info("商品数量：{}",total);
    }

    @Test
    void skuService2() {
        List<SKU> sourceSKUList = generatorSKU();
        LOG.info("基于方法引用");
        int total=skuService.stockCount(sourceSKUList,SKU::getStock);
        LOG.info("商品数量：{}",total);
    }


}