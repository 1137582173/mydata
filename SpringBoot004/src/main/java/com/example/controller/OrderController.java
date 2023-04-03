package com.example.controller;

import com.example.pojo.Order;
import com.example.returnjson.OrderFindJson;
import com.example.returnjson.OrderJson;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;
    OrderJson orderJson=new OrderJson();


    @PostMapping
    public OrderJson add(@RequestBody Order order){
        orderJson.setInfo("添加数据");
        orderJson.setData("失败");
        orderJson.setStatue(200);
        boolean isOK=orderService.add(order);
        if (isOK == true) {
            orderJson.setData("成功");
        }
        return orderJson;
    }

    @DeleteMapping("/{uid}")
    public OrderJson del(@PathVariable Integer uid){
        orderJson.setInfo("删除数据");
        orderJson.setData("失败");
        orderJson.setStatue(200);
        Boolean isOK=orderService.del(uid);
        if (isOK == true) {
            orderJson.setData("成功");
        }
        return orderJson;
    }

    @PutMapping
    public OrderJson upd(@RequestBody Order order){
        orderJson.setInfo("更新/修改数据");
        orderJson.setData("失败");
        orderJson.setStatue(200);
        boolean isOK=orderService.upd(order);
        if (isOK == true) {
            orderJson.setData("成功");
        }
        return orderJson;
    }

    @GetMapping("/{uid}")
    public OrderFindJson findById(@PathVariable Integer uid){
        Order order=orderService.findById(uid);
        OrderFindJson orderFindJson=new OrderFindJson();
        orderFindJson.setInfo("查询");
        orderFindJson.setStatue(200);
        orderFindJson.setOrder(order);
        return orderFindJson;
    }



}
