package vn.com.restaurant.entity;

import javax.persistence.*;

import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "Position")
public class Position {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPosition;
	private String name;

	@OneToMany(mappedBy = "position")
	private List<Staff> staffs;
}
