package vn.com.restaurant.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Position {
	private int id;
	private String name;
}