package com.yxg.service.hystrix;

import com.yxg.pojo.Order;
import com.yxg.pojo.Product;
import com.yxg.service.feign.ProductFeignService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yxg on 2024/3/24。
 */
@Component
public class ProductFallbackService implements ProductFeignService {
    @Override
    public List<Product> selectProductList() {
        List<Product> list = Arrays.asList(
                new Product(1, "Hystrix", 2, 555),
                new Product(1, "Hystrix", 2, 555),
                new Product(1, "Hystrix", 2, 555)
        );
        return list;
    }
}
