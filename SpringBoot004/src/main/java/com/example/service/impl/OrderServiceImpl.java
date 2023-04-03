package com.example.service.impl;

import com.example.mapper.OrderMapper;
import com.example.pojo.Order;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public boolean add(Order order) {
        int row= orderMapper.add(order);
        return row>0;
    }

    @Override
    public boolean del(Integer uid) {
        int row= orderMapper.del(uid);
        return row>0;
    }

    @Override
    public boolean upd(Order order) {
        int row=orderMapper.update(order);
        return row>0;
    }

    @Override
    public Order findById(Integer uid) {
        return orderMapper.findById(uid);
    }


}

