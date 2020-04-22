package vn.com.restaurant.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Login {
	private int id;
	private String userName;
	private String pass;
	private int staffId;
}
