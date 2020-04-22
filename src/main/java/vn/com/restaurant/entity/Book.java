package vn.com.restaurant.entity;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Book {
	private int id;
	private Date date;
	private int amount;
	private int CustomerId;
	private int TableId;
}
