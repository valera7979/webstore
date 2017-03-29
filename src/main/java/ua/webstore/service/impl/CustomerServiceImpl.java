package ua.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.webstore.domain.Customer;
import ua.webstore.domain.repository.CustomerRepository;
import ua.webstore.service.CustomerService;

import java.util.List;

/**
 * Created by Валера on 20.03.2017.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }
}
