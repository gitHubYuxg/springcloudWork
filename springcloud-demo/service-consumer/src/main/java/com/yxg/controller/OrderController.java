package com.yxg.controller;

import com.yxg.pojo.Order;
import com.yxg.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yxg on 2024/3/23。
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService OrderServiceImp;
    @GetMapping("/selectOrderList")
    public List<Order> selectOrderList(){
        return OrderServiceImp.selectOrderByid();
    }

}
