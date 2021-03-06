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
	private Integer idBook;
	@Column(name = "date")
	private Date date;
	@Column(name = "amount")
	private Integer amount;

	@Column(name = "CustomerId")
	private Integer CustomerId;

	@Column(name = "TableId")
	private Integer TableId;
	@Column(name = "note")
	private String note;

	@OneToOne
	@JoinColumn(name = "IdCustomer")
	private Customer customer;

	@ManyToOne
	@JoinColumn(name = "invoice_id")
	private Invoice invoice;
}
