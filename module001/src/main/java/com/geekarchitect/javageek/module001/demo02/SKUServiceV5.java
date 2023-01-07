package com.geekarchitect.javageek.module001.demo02;

import com.geekarchitect.javageek.module001.demo01.SKU;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


/**
 * @author 极客架构师@吴念
 * @createTime 2022/12/29
 */
public class SKUServiceV5 {
    private static final Logger LOG = LoggerFactory.getLogger(SKUServiceV5.class);

    public void consumerSKU(List<SKU> sourceSkuList,
                                 Consumer<SKU> skuConsumer) {
       for(SKU sku:sourceSkuList){
           skuConsumer.accept(sku);
       }
    }
    public List<String> functionSKU(List<SKU> sourceSkuList,
                            Function<SKU,String> skuFunction) {
        List<String> filteredSkuList = new ArrayList<>();
        for(SKU sku:sourceSkuList){
            filteredSkuList.add(skuFunction.apply(sku));
        }
        return filteredSkuList;
    }
}
