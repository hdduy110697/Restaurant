package vn.com.restaurant.service;

import java.util.List;
import java.util.Optional;

import vn.com.restaurant.entity.Staff;

public interface IStaffService {
	
	
	List<Staff> findAllStaff();
    Optional<Staff> findById(Integer id);
    void save(Staff staff);
    void remove(Staff staff);

}
