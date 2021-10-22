package com.accenture.ws.impl;

import com.accenture.ws.entity.Order;
import com.accenture.ws.entity.OrderBill;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DiscountedBill extends OrderBill {

    public DiscountedBill() {
    }

    @Override
    public double getTotalBill() {
        double totalPrice = 0.0;
        List<Order> priceList = getOrderList();
        for (Order price :priceList) {
            if (price.isDiscounted()) {
                totalPrice = (price.getPrice() - (price.getPrice()* (price.getIsDiscountPercentage()/100)) ) + totalPrice;
            } else {
                totalPrice = price.getPrice() + totalPrice;
            }
        }
        return totalPrice;
    }
}
