package vn.com.restaurant.entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "Position")
public class Position {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPosition;
	private String name;
	@ManyToOne
	@JoinColumn(name = "staff_id")
	private Staff staff;
}
