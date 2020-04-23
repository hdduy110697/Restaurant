package vn.com.restaurant.entity;

import java.util.Date;

import javax.persistence.*;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Process")
public class Report {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "date")
	private Date date;

	@Column(name = "retract")
	private Double retract;

	@Column(name = "readOut")
	private Double readOut;

	@Column(name = "staff")
	private String staff;

	@Column(name = "describe")
	private String describe;
	
	@ManyToOne
	@JoinColumn(name = "idImports")
	private Report report;
}
