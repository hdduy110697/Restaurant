package vn.com.restaurant.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Supplier {
	private int id;
	private String name;
	private String address;
	private int phone;
	private String describe;
}
