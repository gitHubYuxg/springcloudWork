package com.yxg.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yxg on 2024/3/23。
 */
@Data
public class Order implements Serializable {
    private Integer id;
    private String orderNo;
    private String orderAddress;
    private Double totalPrice;
    private List<Product> productList;

    public Order(Integer id, String orderNo, String orderAddress,
                 Double totalPrice, List<Product> productList) {
        this.id = id;
        this.orderNo = orderNo;
        this.orderAddress = orderAddress;
        this.totalPrice = totalPrice;
        this.productList = productList;
    }
}
