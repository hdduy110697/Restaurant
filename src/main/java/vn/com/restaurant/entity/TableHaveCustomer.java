package vn.com.restaurant.entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@Table(name = "TableHaveCustomer")
public class TableHaveCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tablehavecustomer_id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "cmnd")
    private Integer CMND;
    @OneToMany(mappedBy = "tableHaveCustomer")
    private List<Invoice> invoices;

}
