package com.Helsinki.ecommerce.Service;

import com.Helsinki.ecommerce.dto.Purchase;
import com.Helsinki.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
