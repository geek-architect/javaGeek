package com.geekarchitect.javageek.module003.demo02;

import com.geekarchitect.javageek.module003.demo01.BaseTest;
import com.geekarchitect.javageek.module003.demo01.SKU;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SKUServiceV2Test extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SKUServiceV2Test.class);

    @Autowired
    private ISKUServiceV2 skuService;

    @Test
    void stockCount() {
        List<SKUV2> sourceSKUList = generatorSKUV2();
        LOG.info("基于面向接口编程思想");
        int total=skuService.oversellCount(sourceSKUList);
        LOG.info("超卖商品数量：{}",total);
    }
}