package com.geekarchitect.javageek.module003.demo02;

import com.geekarchitect.javageek.module003.demo01.SKU;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/2/6
 */
@Service
public class SKUServiceV2 implements ISKUServiceV2{
    @Override
    public int oversellCount(List<SKUV2> sourceSkuList) {
        int result=0;
        for(SKUV2 sku:sourceSkuList){
            if(sku.hasOversell()){
                result++;
            }
        }
        return result;
    }
}
