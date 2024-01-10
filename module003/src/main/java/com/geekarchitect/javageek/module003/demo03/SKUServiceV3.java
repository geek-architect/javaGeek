package com.geekarchitect.javageek.module003.demo03;

import com.geekarchitect.javageek.module003.demo01.SKU;
import com.geekarchitect.javageek.module003.demo02.ISKUServiceV2;
import com.geekarchitect.javageek.module003.demo02.SKUV2;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/2/6
 */
@Service
public class SKUServiceV3 implements ISKUServiceV3 {
    @Override
    public int oversellCount(List<SKUV3> sourceSkuList,OversellV2<SKUV3> oversellV2) {
        int result=0;
        for(SKUV3 sku:sourceSkuList){
            if(oversellV2.hasOversell(sku)){
                result++;
            }
        }
        return result;
    }
}
