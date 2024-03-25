package com.yxg.controller;

import com.yxg.pojo.Product;
import com.yxg.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yxg on 2024/3/23。
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/selectProductList")
    public List<Product> selectProductList() throws InterruptedException {
        //product2
        return productService.selectProductList();
    }
}
