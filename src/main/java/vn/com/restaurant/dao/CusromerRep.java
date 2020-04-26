package vn.com.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.com.restaurant.entity.Customer;

@Repository
public interface CusromerRep extends JpaRepository<Customer,Integer> {
    Customer getByIdCustomer(Integer id);
}
