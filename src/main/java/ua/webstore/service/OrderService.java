package ua.webstore.service;


public interface OrderService {
    void processOrder(String productId, long count);
}
