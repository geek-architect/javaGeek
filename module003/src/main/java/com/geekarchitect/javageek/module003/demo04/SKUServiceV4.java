package com.geekarchitect.javageek.module003.demo04;

import com.geekarchitect.javageek.module003.demo03.ISKUServiceV3;
import com.geekarchitect.javageek.module003.demo03.OversellV2;
import com.geekarchitect.javageek.module003.demo03.SKUV3;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/2/6
 */
@Service
public class SKUServiceV4 implements ISKUServiceV4 {
    @Override
    public int oversellCount(List<SKUV3> sourceSkuList, Predicate<SKUV3> predicate) {
        int result=0;
        for(SKUV3 sku:sourceSkuList){
            if(predicate.test(sku)){
                result++;
            }
        }
        return result;
    }
}
