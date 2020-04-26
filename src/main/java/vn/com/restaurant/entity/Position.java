package vn.com.restaurant.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

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

	
	@JsonManagedReference
	@OneToMany(mappedBy = "position")
	private List<Staff> staffs;
}
