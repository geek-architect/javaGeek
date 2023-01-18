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
@Service
public class ShopService implements IShopService {
    private static final Logger LOG = LoggerFactory.getLogger(ShopService.class);
    @Autowired
    private ISKUService skuService;

    private final double miniSales = 100;

    @Override
    public List<SKU> searchSku01(List<SKU> sourceSkuList) {
        return skuService.filterSKUByStrategy(sourceSkuList, new Predicate<SKU>() {
            @Override
            public boolean test(SKU sku) {
                return sku.getCategoryName().equals("笔记本");
            }
        });
    }

    @Override
    public List<SKU> searchSku02(List<SKU> sourceSkuList) {
        return skuService.filterSKUByStrategy(sourceSkuList, sku -> sku.getPrice() > 10000);
    }

    @Override
    public List<SKU> searchSku03(List<SKU> sourceSkuList) {
        final int miniStock = 10;
        return skuService.filterSKUByStrategy(sourceSkuList, sku -> sku.getStock() > miniStock);
    }

    @Override
    public List<SKU> searchSku04(List<SKU> sourceSkuList) {
        return skuService.filterSKUByStrategy(sourceSkuList, sku -> sku.getSales() > this.miniSales);
    }

}
