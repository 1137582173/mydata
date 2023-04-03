package com.example.service;

import com.example.pojo.Order;

public interface OrderService {
    boolean add(Order order);
    boolean del(Integer uid);
    boolean upd(Order order);

    Order findById(Integer uid);

}
