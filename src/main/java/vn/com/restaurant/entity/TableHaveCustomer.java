package vn.com.restaurant.entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "TableHaveCustomer")
public class TableHaveCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTable;
    @Column(name = "name")
    private String name;
    @Column(name = "cmnd")
    private Integer CMND;
}
