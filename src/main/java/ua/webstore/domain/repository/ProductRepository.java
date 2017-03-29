package ua.webstore.domain.repository;

import ua.webstore.domain.Product;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Валера on 19.03.2017.
 */
public interface ProductRepository {
    List<Product> getAllProducts();

    Product getProductById(String productID);

    List<Product> getProductsByCategory(String caregory);

    List<Product> getProductsByFilter(Map<String, List<String>> filterParams);

    List <Product> getProductsByManufacturer(String manufacturer);

    void addProduct(Product product);
}
