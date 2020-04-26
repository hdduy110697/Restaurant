package vn.com.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import vn.com.restaurant.entity.Customer;
import vn.com.restaurant.service.ICustomerService;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @PostMapping("/add")
    public ResponseEntity<?> addCustomer(@Valid @RequestBody Customer customer, BindingResult result){
        if (result.hasErrors ()){
            Map<String,String> errorMap=new HashMap<> (  );
            for (FieldError error:result.getFieldErrors ()) {
                errorMap.put ( error.getField (),error.getDefaultMessage () );
            }
            return new ResponseEntity<Map<String,String>>(errorMap,HttpStatus.BAD_REQUEST);
        }
        Customer newCustomer =customerService.saveOrUpdateCustomer ( customer );
        return new ResponseEntity<Customer> ( newCustomer, HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public List<Customer> getAllCustomer(){
        return customerService.findAll ();
    }
    @GetMapping("/{idCustomer}")
    public ResponseEntity<?> getCustomerById(@PathVariable Integer idCustomer){
        Customer customer= customerService.findById ( idCustomer );
        return new ResponseEntity<Customer>(customer,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{idCustomer}")
    public  ResponseEntity<?> deleteCustomerById(@PathVariable Integer idCustomer){
        customerService.deleteById ( idCustomer );
        return new ResponseEntity<String> ("Customer deleted",HttpStatus.OK);
    }

}
