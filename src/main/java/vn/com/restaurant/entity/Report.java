package vn.com.restaurant.entity;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Report {
	private int id;
	private Date date;
	private Double retract;
	private Double readOut;
	private String staff;
	private String describe;
}
