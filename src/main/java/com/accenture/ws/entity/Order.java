package com.accenture.ws.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name="`order`")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String orderName;
    private double price;
    private boolean isDiscounted;
    private double  isDiscountPercentage = 5.0;

    public Order() {
    }

    public Order(String orderName, double price, boolean isDiscounted) {
        this.orderName = orderName;
        this.price = price;
        this.isDiscounted = isDiscounted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscounted() {
        return isDiscounted;
    }

    public void setDiscounted(boolean discounted) {
        isDiscounted = discounted;
    }

    public double getIsDiscountPercentage() {
        return isDiscountPercentage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isDiscountPercentage, isDiscounted, orderName, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Order other = (Order) obj;
        return Objects.equals(id, other.id)
                && Double.doubleToLongBits(isDiscountPercentage) == Double.doubleToLongBits(other.isDiscountPercentage)
                && isDiscounted == other.isDiscounted && Objects.equals(orderName, other.orderName)
                && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderName='" + orderName + '\'' +
                ", price=" + price +
                ", isDiscounted=" + isDiscounted +
                ", isDiscountPercentage=" + isDiscountPercentage +
                '}';
    }
}
