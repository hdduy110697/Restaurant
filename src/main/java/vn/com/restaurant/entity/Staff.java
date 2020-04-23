package vn.com.restaurant.entity;



import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Staff")
public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idStaff;

	@Column(name = "name")
	private String name;

	@Column(name = "gender")
	private Integer gender;//1=male 2=female

	@Column(name = "birthdate")
	private Date birthDate;

	@Column(name = "address")
	private String address;

	@Column(name = "phone")
	private Integer phone;

	@Column(name = "hiredate")
	private Date hireDate;

	@Column(name = "describe")
	private String describe;

	@Column(name = "part")
	private String part;


	//referent key positon
	@OneToMany(mappedBy = "Staff")
	private List<Shift> shift;
	
	@OneToMany(mappedBy = "Staff")
	private List<Position> position;
	
	@OneToMany(mappedBy = "Staff")
	private List<Salary> salary;
	
	@ManyToMany
	@JoinColumn(name="idEmployeeTimesheet")
	private EmployeeTimesheet employeeTimesheet;

}
