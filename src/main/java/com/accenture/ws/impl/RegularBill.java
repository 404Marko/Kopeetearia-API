package com.accenture.ws.impl;

import com.accenture.ws.entity.Order;
import com.accenture.ws.entity.OrderBill;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegularBill extends OrderBill {

    public RegularBill() {
    }

    @Override
    public double getTotalBill() {

        double totalPrice = 0.0;
        List<Order> priceList = getOrderList();
        for (Order price :priceList) {
            totalPrice = price.getPrice() + totalPrice;
        }
        return totalPrice;
    }


}
