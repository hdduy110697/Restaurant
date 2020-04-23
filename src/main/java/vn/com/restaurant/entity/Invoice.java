package vn.com.restaurant.entity;

import java.util.Date;

import javax.persistence.*;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Invoice")
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@Column(name = "date")
	private Date date;

	//referent to table
	private Integer idTable;
	//referent to Customer
	private Integer CMND;

	@Column(name = "amount")
	private Integer amount;

	@Column(name = "total")
	private Double total;

	@Column(name = "surplus")
	private Double surplus;

	@Column(name = "paid")
	private Double paid;

}
