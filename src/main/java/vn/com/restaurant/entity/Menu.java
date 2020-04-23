package vn.com.restaurant.entity;

import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;

import lombok.Data;

@Entity
@Data
@Table(name = "Menu")

public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private Integer price;

	@Column(name = "cost")
	private Integer cost;

	@Column(name = "unit")
	private String unit;

	
}
