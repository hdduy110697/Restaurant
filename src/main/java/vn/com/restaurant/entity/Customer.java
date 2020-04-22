package vn.com.restaurant.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Customer {

	private int id;
	private String name;
	private String address;
	private String phone;
	private String describe;
}
