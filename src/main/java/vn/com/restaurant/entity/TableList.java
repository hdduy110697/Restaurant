package vn.com.restaurant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

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
