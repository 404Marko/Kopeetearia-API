package com.accenture.ws.entity;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class OrderBill {

    private List<Order> orderList;
    private CafeClerk clerk;

    public OrderBill() {
    }

    public CafeClerk getClerk() {
        return clerk;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public abstract double getTotalBill();
}
