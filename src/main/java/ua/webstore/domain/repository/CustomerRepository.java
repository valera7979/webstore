package ua.webstore.domain.repository;

import ua.webstore.domain.Customer;

import java.util.List;

/**
 * Created by Валера on 20.03.2017.
 */
public interface CustomerRepository {
    List<Customer> getAllCustomers();
}
