package com.yxg.service.imp;

import com.yxg.pojo.Product;
import com.yxg.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yxg on 2024/3/23。
 */
@Service
public class ProductServiceImp implements ProductService {
    @Override
    public List<Product> selectProductList() throws InterruptedException {
       // Thread.sleep(5000);
        return Arrays.asList(
                new Product(2,"商品1",2,555),
                new Product(2,"商品1",2,555),
                new Product(2,"商品1",2,555)
        );
    }
}
