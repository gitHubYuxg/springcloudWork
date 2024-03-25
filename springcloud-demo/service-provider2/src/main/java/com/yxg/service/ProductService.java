package com.yxg.service;

import com.yxg.pojo.Product;

import java.util.List;

/**
 * Created by yxg on 2024/3/23。
 */
public interface ProductService {

    /**
     * 查询商品集合
     * @return
     */
    List<Product> selectProductList() throws InterruptedException;
}
