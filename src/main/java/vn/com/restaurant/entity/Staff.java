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
	@Column(name = "staff_id")
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

	@Column(name = "note")
	private String note;

	@Column(name = "part")
	private String part;


	//referent key positon
	@OneToMany(mappedBy = "staff")
	private List<Shift> shift;
	

	@ManyToOne
	@JoinColumn(name = "idPosition")
	private Position position;
	
	@OneToMany(mappedBy = "staff")
	private List<Salary> salary;

	@ManyToMany
	@JoinTable(name = "Staff_EmployeeTimesheet",
			joinColumns = @JoinColumn(name = "staff_id"),
			inverseJoinColumns = @JoinColumn(name = "timesheet_id")
	)
	private List<EmployeeTimesheet> employeeTimesheets;

}
