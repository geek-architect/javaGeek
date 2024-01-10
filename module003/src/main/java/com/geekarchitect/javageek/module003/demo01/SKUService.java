package com.geekarchitect.javageek.module003.demo01;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/1/30
 */
@Service
public class SKUService implements ISKUService{

    @Override
    public int stockCount(List<SKU> sourceSkuList, ISkuStock<SKU> skuStock) {
       int result=0;
       for(SKU sku:sourceSkuList){
           result+=skuStock.getStock(sku);
       }
       return  result;
    }
}
