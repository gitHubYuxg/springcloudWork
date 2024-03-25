package com.yxg.service;

import com.yxg.pojo.Order;

import java.util.List;

/**
 * Created by yxg on 2024/3/23。
 */
public interface OrderService {
    public List<Order> selectOrderByid();
}
