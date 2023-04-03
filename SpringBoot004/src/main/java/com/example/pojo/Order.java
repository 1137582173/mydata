package com.example.pojo;

import lombok.Data;
import org.apache.ibatis.annotations.Param;

@Data
public class Order {
    private int orderId;
    private String orderName;
    private double orderPrice;
    private int orderUid;
}
