package ua.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.webstore.domain.Product;
import ua.webstore.domain.repository.ProductRepository;
import ua.webstore.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private ProductRepository productRepository;
    public void processOrder(String productId, long quantity) {
        Product productById = productRepository.
                getProductById(productId);
        if(productById.getUnitsInStock() < quantity){
            throw new IllegalArgumentException("Out of Stock. Available Units in stock"+ productById.getUnitsInStock());
        }
        productById.setUnitsInStock(productById.getUnitsInStock() -  quantity);
    }
}