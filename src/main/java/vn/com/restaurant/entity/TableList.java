package vn.com.restaurant.entity;

import javax.persistence.*;

import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "TableList")
public class TableList {
	@Id
	private Integer idTable;
	@Column(name = "name")
	private String name;
	@Column(name = "location")
	private String location;

}
