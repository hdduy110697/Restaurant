package vn.com.restaurant.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.restaurant.dao.CusromerRep;
import vn.com.restaurant.entity.Customer;
import vn.com.restaurant.service.ICustomerService;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CusromerRep cusromerRep;

    @Override
    public Customer saveOrUpdateCustomer(Customer customer) {
        if(customer.getIdCustomer ()==null){
            customer.setIdCustomer ( 181311644 );
            customer.setName ( "duy" );
            customer.setNote ( "aaa" );
            customer.setPhone ( "0905219203" );
            customer.setAddress ( "k tr" );
        }
        return cusromerRep.save ( customer );
    }

    @Override
    public List<Customer> findAll() {
        return cusromerRep.findAll ();
    }

    @Override
    public Customer findById(Integer id) {
        return cusromerRep.getByIdCustomer ( id );
    }

    @Override
    public void deleteById(Integer id) {
        cusromerRep.deleteById (id);
    }

}
