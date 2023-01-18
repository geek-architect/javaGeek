package com.geekarchitect.javageek.module002.demo01;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/1/16
 */
public interface IShopService {
    List<SKU> searchSku01(List<SKU> sourceSkuList);

    List<SKU> searchSku02(List<SKU> sourceSkuList);

    List<SKU> searchSku03(List<SKU> sourceSkuList);

    List<SKU> searchSku04(List<SKU> sourceSkuList);
}
