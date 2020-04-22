package vn.com.restaurant.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Table {
	private int id;
	private String name;
	private String location;
}
