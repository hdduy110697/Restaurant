package vn.com.restaurant.entity;

import javax.persistence.*;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Shift")
public class Shift {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  id;

	@Column(name = "shift")
	private String shift;

	@Column(name = "starttime")
	private String startTime;

	@Column(name = "endtime")
	private String endTime;
	@ManyToOne
	@JoinColumn(name = "staff_id")
	private Staff staff;
}
