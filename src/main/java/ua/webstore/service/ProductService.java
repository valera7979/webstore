package ua.webstore.service;


import ua.webstore.domain.Product;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ProductService {
    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    Product getProductById(String productID);

    List<Product> getProductsByFilter(Map<String, List<String>> filterParams);

    List <Product> getProductsByManufacturer(String manufacturer);

    void addProduct(Product product);
}
