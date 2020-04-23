package vn.com.restaurant.entity;



import java.util.Date;

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

	@Column(name = "shift")
	private String shift;

	@Column(name = "hiredate")
	private Date hireDate;

	@Column(name = "describe")
	private String describe;

	@Column(name = "part")
	private String part;

	@Column(name = "salary")
	private Double salary;

	//referent key positon
	private Integer positionId;

}
