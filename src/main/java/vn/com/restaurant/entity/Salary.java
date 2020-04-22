package vn.com.restaurant.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Salary {
	private int id;
	private Double salary;
}
