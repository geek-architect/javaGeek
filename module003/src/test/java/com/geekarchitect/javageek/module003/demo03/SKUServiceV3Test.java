package com.geekarchitect.javageek.module003.demo03;

import com.geekarchitect.javageek.module003.demo01.BaseTest;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SKUServiceV3Test extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SKUServiceV3Test.class);
    @Autowired
    private ISKUServiceV3 skuService;

    @Test
    void oversellCount() {
        List<SKUV3> sourceSKUList = generatorSKUV3();
        LOG.info("基于面向行为编程思想");
        int total=skuService.oversellCount(sourceSKUList,SKUV3::hasOversell);
        LOG.info("超卖商品数量：{}",total);
    }
}