package vn.com.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.com.restaurant.entity.Staff;



public interface StaffDao extends JpaRepository<Staff, Integer> {

}
