package vn.com.restaurant.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Process {
	private int id;
	private String finished;
	private String recipe;
	private Double cost;
}
