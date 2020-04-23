package vn.com.restaurant.entity;

import javax.persistence.*;
import javax.persistence.Table;

import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

@Entity
@Data
@Table(name = "Supplier")
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer number;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "phone")
	private Integer phone;

	@Column(name = "supplyitems")
	private String supplyItems;

	@Column(name = "describe")
	private String describe;

	@ManyToOne
	@JoinColumn(name = "idImports")
	private Imports imports;
}
