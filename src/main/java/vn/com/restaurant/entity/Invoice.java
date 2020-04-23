package vn.com.restaurant.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Invoice")
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer invoiceId;

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
	
	@OneToMany(mappedBy = "invoice")
	private List<Book> book;
	

	@ManyToOne
	@JoinColumn(name = "tablehavecustomer_id")
	private TableHaveCustomer tableHaveCustomer;
}
