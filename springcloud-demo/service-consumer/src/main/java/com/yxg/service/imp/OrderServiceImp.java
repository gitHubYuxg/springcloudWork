package com.yxg.service.imp;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.yxg.pojo.Order;
import com.yxg.pojo.Product;
import com.yxg.service.OrderService;
import com.yxg.service.feign.ProductFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yxg on 2024/3/23。
 */
@Service
public class OrderServiceImp implements OrderService {
    @Autowired
    private ProductFeignService productFeignService;

//
//    @Autowired
//    private DiscoverClient
    public List<Order> selectOrderByidFallback(){
        List<Product> list = Arrays.asList(
                new Product(1, "Hystrix", 2, 555),
                new Product(1, "Hystrix", 2, 555),
                new Product(1, "Hystrix", 2, 555)
        );
        List<Order> listOrder = Arrays.asList(new Order(1, "123", "中国",
                12d, productFeignService.selectProductList()));
        return listOrder;
    }
    @HystrixCommand(fallbackMethod = "selectOrderByidFallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "3"),
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "50"),
            @HystrixProperty(name = "circuitBreaker.sleWindowInMilliseconds",value = "300000")
    })
    @Override
    public List<Order> selectOrderByid() {
        List<Order> list = Arrays.asList(
                new Order(1, "123", "中国",
                        12d, productFeignService.selectProductList()),
                new Order(2, "123", "中国",
                        12d, productFeignService.selectProductList()),
                new Order(3, "123", "中国",
                        12d, productFeignService.selectProductList()),
                new Order(4, "123", "中国",
                        12d, productFeignService.selectProductList()),
                new Order(5, "123", "中国",
                        12d, productFeignService.selectProductList()),
                new Order(6, "123", "中国",
                        12d, productFeignService.selectProductList()),
                new Order(7, "123", "中国",
                        12d, productFeignService.selectProductList()),
                new Order(8, "123", "中国",
                        12d, productFeignService.selectProductList()),
                new Order(9, "123", "中国",
                        12d, productFeignService.selectProductList()),
                new Order(10, "123", "中国",
                        12d, productFeignService.selectProductList())
        );
        return list;
    }
}
