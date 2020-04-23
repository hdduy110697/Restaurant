package vn.com.restaurant.entity;

import java.util.Date;

import javax.persistence.*;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "date")
	private Date date;
	@Column(name = "amount")
	private Integer amount;

	@Column(name = "CustomerId")
	private Integer CustomerId;

	@Column(name = "TableId")
	private Integer TableId;
	@Column(name = "describe")
	private String describe;
}
