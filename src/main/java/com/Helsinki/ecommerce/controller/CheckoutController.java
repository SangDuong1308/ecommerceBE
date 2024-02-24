package com.Helsinki.ecommerce.controller;

import com.Helsinki.ecommerce.Service.CheckoutService;
import com.Helsinki.ecommerce.dto.Purchase;
import com.Helsinki.ecommerce.dto.PurchaseResponse;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        return checkoutService.placeOrder(purchase);
    }
}
