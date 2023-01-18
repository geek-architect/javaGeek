package com.geekarchitect.javageek.module002.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/1/16
 */
@Service("ShopServiceV2")
public class ShopServiceV2 implements IShopService {
    private static final Logger LOG = LoggerFactory.getLogger(ShopServiceV2.class);
    @Autowired
    private ISKUService skuService;

    private final double miniSales = 100;

    @Override
    public List<SKU> searchSku01(List<SKU> sourceSkuList) {
        return skuService.filterSKUByStrategy(sourceSkuList, new Predicate<SKU>() {
            @Override
            public boolean test(SKU sku) {
                LOG.info("匿名类 this={}",this.getClass().getName());
                LOG.info("匿名类 外部类this={}",ShopServiceV2.this.getClass().getName());
                return sku.getCategoryName().equals("笔记本");
            }
        });
    }

    @Override
    public List<SKU> searchSku02(List<SKU> sourceSkuList) {
        return skuService.filterSKUByStrategy(sourceSkuList,sku ->  {
            LOG.info("lambda表达式 this={}",this.getClass().getName());
            LOG.info("lambda表达式 外部类this={}",ShopServiceV2.this.getClass().getName());
            return sku.getSales() > this.miniSales;
        }
        );
    }

    @Override
    public List<SKU> searchSku03(List<SKU> sourceSkuList) {
        return null;
    }

    @Override
    public List<SKU> searchSku04(List<SKU> sourceSkuList) {
        return null;
    }

}
