package ua.webstore.domain.repository.impl;

import org.springframework.stereotype.Repository;
import ua.webstore.domain.Customer;
import ua.webstore.domain.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Валера on 20.03.2017.
 */
@Repository
public class InMemoryCustomerRepository implements CustomerRepository{

    private List<Customer> customerList = new ArrayList<Customer>();
    public InMemoryCustomerRepository() {
        Customer ivan = new Customer("C123","Ivan","Харьков");
        customerList.add(ivan);
    }

    public List<Customer> getAllCustomers() {
        return customerList;
    }
}
