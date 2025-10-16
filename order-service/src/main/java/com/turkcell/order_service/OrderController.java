package com.turkcell.order_service;


import com.turkcell.order_service.client.ProductClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    private ProductClient productClient;
    public OrderController(ProductClient productClient) {
        this.productClient = productClient;
    };

    @GetMapping
    public String sayHi() {
        String responsFromProductService = productClient.get();
        return "Hello World from Order Service çalıştı orderserviceden gelen cevap : " + responsFromProductService;
    }
}
