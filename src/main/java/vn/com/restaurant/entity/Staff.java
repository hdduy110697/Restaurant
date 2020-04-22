package vn.com.restaurant.entity;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Staff {
	
	@Id
    private Integer id;
	private String name;
	private int gender;
	private Date birthDate;
	private String address;
	private int phone;
	private String shift;
	private Date hireDate;
	private String describe;
	private int salaryId;
	private int shiftId;
	private int positionId;

}
