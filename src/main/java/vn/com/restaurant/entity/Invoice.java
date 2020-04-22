package vn.com.restaurant.entity;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Invoice {
	private String id;
	private Date date;
	private int amount;
	private Double total;
	private Double surplus;
	private Double paid;
	private int bookId;
}
