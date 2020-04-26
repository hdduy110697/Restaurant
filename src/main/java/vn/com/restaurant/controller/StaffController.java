package vn.com.restaurant.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.com.restaurant.entity.Staff;
import vn.com.restaurant.service.IStaffService;

@RestController
@RequestMapping("staff")
public class StaffController {
	
	@Autowired
	private IStaffService staffService;
	
	
	// get all Staff
	@GetMapping("getStaff")
	public ResponseEntity<?> getStaff(){
		List<Staff> staff = new ArrayList<Staff>();
		staff= staffService.findAllStaff();
		return new ResponseEntity<List<Staff>>(staff, HttpStatus.OK);
	}

}
