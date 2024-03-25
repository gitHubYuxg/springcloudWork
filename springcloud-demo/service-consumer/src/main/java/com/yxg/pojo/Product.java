package com.yxg.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by yxg on 2024/3/23。
 */
@Data
public class Product implements Serializable {
    private Integer id;
    private String productName;
    private Integer productNum;
    private Integer productPrice;
    public Product(Integer id,String productName,Integer productNum,Integer productPrice){
        this.id=id;
        this.productName=productName;
        this.productNum=productNum;
        this.productPrice=productPrice;
    }
}
