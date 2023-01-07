package com.geekarchitect.javageek.module001.demo01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

class SKUServiceV2Test extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(SKUServiceV2Test.class);

    private SKUServiceV2 skuServiceV2;

    @BeforeEach
    void setUp() {
        this.skuServiceV2 = new SKUServiceV2();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void filterSKUByStrategy() {
        List<SKU> sourceSkuList = generatorSKU();
        LOG.info("第四版：基于策略模式，并行化的多条件过滤");
        LOG.info("源商品集合：数量={},商品={}", sourceSkuList.size(), sourceSkuList);
        SKUFilterStrategy categoryNameFilter = new CategoryNameFilterStrategy();
        List<SKU> filteredSkuList = skuServiceV2.filterSKUByStrategy(sourceSkuList,
                categoryNameFilter);

        SKUFilterStrategy priceFilter = new PriceGreaterThanFilterStrategy();
        filteredSkuList = skuServiceV2.filterSKUByStrategy(filteredSkuList, priceFilter);
        LOG.info("已过滤商品集合：数量={},商品={}", filteredSkuList.size(), filteredSkuList);
    }

    @Test
    void filterSKUByStrategyV2() {
        List<SKU> sourceSkuList = generatorSKU();
        LOG.info("第五版：基于匿名类的策略模式，");
        LOG.info("源商品集合：数量={},商品={}", sourceSkuList.size(), sourceSkuList);
        List<SKU> filteredSkuList = skuServiceV2.filterSKUByStrategy(sourceSkuList, new SKUFilterStrategy() {
            @Override
            public boolean filter(SKU sku) {
                return sku.getCategoryName().equals("笔记本");
            }
        });
        filteredSkuList = skuServiceV2.filterSKUByStrategy(filteredSkuList, new SKUFilterStrategy() {
            @Override
            public boolean filter(SKU sku) {
                return sku.getPrice() > 10000;
            }
        });
        LOG.info("已过滤商品集合：数量={},商品={}", filteredSkuList.size(), filteredSkuList);
    }

    @Test
    void filterSKUByStrategyV3() {
        List<SKU> sourceSkuList = generatorSKU();
        LOG.info("第六版：基于Lambda表达式的策略模式，");
        LOG.info("源商品集合：数量={},商品={}", sourceSkuList.size(), sourceSkuList);
        List<SKU> filteredSkuList = skuServiceV2.filterSKUByStrategy(sourceSkuList,
                (SKU sku) -> sku.getCategoryName().equals("笔记本"));
        filteredSkuList = skuServiceV2.filterSKUByStrategy(filteredSkuList,
                (SKU sku) -> sku.getPrice() > 10000);
        LOG.info("已过滤商品集合：数量={},商品={}", filteredSkuList.size(), filteredSkuList);
    }

    @Test
    void filterSKUByStrategyV4() {
        List<SKU> sourceSkuList = generatorSKU();
        LOG.info("第六版：基于Lambda表达式的策略模式，");
        LOG.info("源商品集合：数量={},商品={}", sourceSkuList.size(), sourceSkuList);
        List<SKU> filteredSkuList = skuServiceV2.filterSKUByStrategy(sourceSkuList,
                (SKU sku) -> sku.getCategoryName().equals("笔记本"));
        filteredSkuList = skuServiceV2.filterSKUByStrategy(filteredSkuList,
                (sku) -> sku.getCategoryName().equals("笔记本"));
        filteredSkuList = skuServiceV2.filterSKUByStrategy(filteredSkuList,
                sku -> sku.getCategoryName().equals("笔记本"));
        LOG.info("已过滤商品集合：数量={},商品={}", filteredSkuList.size(), filteredSkuList);
    }

    @Test
    void filterSKUByStrategyV5() {
        List<SKU> sourceSkuList = generatorSKU();
        LOG.info("第六版：基于Lambda表达式的策略模式，");
        LOG.info("源商品集合：数量={},商品={}", sourceSkuList.size(), sourceSkuList);
        List<SKU> filteredSkuList = skuServiceV2.filterSKUByStrategy(sourceSkuList,
                sku -> {
                     return sku.getCategoryName().equals("笔记本");
                });
        filteredSkuList = skuServiceV2.filterSKUByStrategy(filteredSkuList,
                sku -> {
                    LOG.info("sku={}", sku);
                    return sku.getCategoryName().equals("笔记本");
                });

        LOG.info("已过滤商品集合：数量={},商品={}", filteredSkuList.size(), filteredSkuList);
    }

}