package com.yxg.service.feign;

import com.yxg.pojo.Product;
import com.yxg.service.hystrix.ProductFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by yxg on 2024/3/23。
 */
@FeignClient(value = "server-provider" ,path = "/product",
        fallback = ProductFallbackService.class)
public interface ProductFeignService {
    @GetMapping("/selectProductList")
    public List<Product> selectProductList();
}
