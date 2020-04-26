package vn.com.restaurant.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.com.restaurant.dao.StaffDao;
import vn.com.restaurant.entity.Staff;
import vn.com.restaurant.service.IStaffService;

@Service
@Transactional
public class StaffServiceImpl implements IStaffService{
	
	@Autowired
	private StaffDao staffDao;

	@Override
	public List<Staff> findAllStaff() {
		return (List<Staff>)staffDao.findAll();
	}

	@Override
	public Optional<Staff> findById(Integer id) {

		return staffDao.findById(id);
	}

	@Override
	public void save(Staff staff) {
		staffDao.save(staff);
		
	}

	@Override
	public void remove(Staff staff) {
		staffDao.delete(staff);
		
	}

}
