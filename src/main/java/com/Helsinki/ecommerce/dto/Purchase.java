package com.Helsinki.ecommerce.dto;

import com.Helsinki.ecommerce.entity.Address;
import com.Helsinki.ecommerce.entity.Customer;
import com.Helsinki.ecommerce.entity.Order;
import com.Helsinki.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;

    private Address shippingAddress;

    private Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItems;
}
