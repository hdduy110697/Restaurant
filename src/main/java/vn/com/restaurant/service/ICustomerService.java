package vn.com.restaurant.service;

import vn.com.restaurant.entity.Customer;

import java.util.List;

public interface ICustomerService {
    Customer saveOrUpdateCustomer(Customer customer);
    List<Customer> findAll();
    Customer findById(Integer id);
    void deleteById(Integer id);

}
