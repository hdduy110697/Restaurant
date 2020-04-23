package vn.com.restaurant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Login")
public class Login {
	@Id
	private String userName;

	@Column(name = "password")
	private String pass;

	@Column(name = "authorization")
	private String authorization;
	
	@OneToOne
	@JoinColumn(name="idStaff")
	private Staff staff;
}
