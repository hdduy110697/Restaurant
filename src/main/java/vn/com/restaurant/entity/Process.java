package vn.com.restaurant.entity;

import javax.persistence.*;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Process")
public class Process {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "finished")
	private String finished;

	@Column(name = "recipe")
	private String recipe;

	@Column(name = "cost")
	private Double cost;
}
