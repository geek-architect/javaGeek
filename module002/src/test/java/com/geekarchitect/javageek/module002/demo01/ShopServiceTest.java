package com.geekarchitect.javageek.module002.demo01;

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
    private IShopService shopService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void searchSku01() {
        List<SKU> sourceSKUList = generatorSKU();
        LOG.info("基于匿名类");
        LOG.info("源商品集合：数量={},商品={}", sourceSKUList.size(), sourceSKUList);
        List<SKU> filteredSkuList = shopService.searchSku01(sourceSKUList);
        LOG.info("已过滤商品集合：数量={},商品={}", filteredSkuList.size(), filteredSkuList);
    }

    @Test
    void searchSku02() {
        List<SKU> sourceSKUList = generatorSKU();
        LOG.info("基于Lambda表达式（无状态）");
        LOG.info("源商品集合：数量={},商品={}", sourceSKUList.size(), sourceSKUList);
        List<SKU> filteredSkuList = shopService.searchSku02(sourceSKUList);
        LOG.info("已过滤商品集合：数量={},商品={}", filteredSkuList.size(), filteredSkuList);
    }

    @Test
    void searchSku03() {
        List<SKU> sourceSKUList = generatorSKU();
        LOG.info("基于Lambda表达式（有状态，访问局部变量）");
        LOG.info("源商品集合：数量={},商品={}", sourceSKUList.size(), sourceSKUList);
        List<SKU> filteredSkuList = shopService.searchSku03(sourceSKUList);
        LOG.info("已过滤商品集合：数量={},商品={}", filteredSkuList.size(), filteredSkuList);
    }

    @Test
    void searchSku04() {
        List<SKU> sourceSKUList = generatorSKU();
        LOG.info("基于Lambda表达式（有状态，访问外部类属性）");
        LOG.info("源商品集合：数量={},商品={}", sourceSKUList.size(), sourceSKUList);
        List<SKU> filteredSkuList = shopService.searchSku04(sourceSKUList);
        LOG.info("已过滤商品集合：数量={},商品={}", filteredSkuList.size(), filteredSkuList);
    }
}