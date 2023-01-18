package com.geekarchitect.javageek.module002.demo01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class ShopServiceV2Test extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(ShopServiceV2Test.class);

    @Resource(name="ShopServiceV2")
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
        LOG.info("基于匿名类 this");
        LOG.info("源商品集合：数量={},商品={}", sourceSKUList.size(), sourceSKUList);
        List<SKU> filteredSkuList = shopService.searchSku01(sourceSKUList);
        LOG.info("已过滤商品集合：数量={},商品={}", filteredSkuList.size(), filteredSkuList);
    }

    @Test
    void searchSku02() {
        List<SKU> sourceSKUList = generatorSKU();
        LOG.info("基于Lambda表达式 this ");
        LOG.info("源商品集合：数量={},商品={}", sourceSKUList.size(), sourceSKUList);
        List<SKU> filteredSkuList = shopService.searchSku02(sourceSKUList);
        LOG.info("已过滤商品集合：数量={},商品={}", filteredSkuList.size(), filteredSkuList);
    }
}