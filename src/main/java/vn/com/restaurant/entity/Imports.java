package vn.com.restaurant.entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "Imports")
public class Imports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dateimport")
    private Date dateImport;

    @Column(name = "barimport")
    private String barImport;

    @Column(name = "barcostimport")
    private Integer barCostImport;

    @Column(name = "tableimport")
    private String tableImport;

    @Column(name = "tablecostimport")
    private Integer tableCostImport;

    @Column(name = "kitchenimport")
    private String kitchenImport;

    @Column(name = "kitchencostimport")
    private Integer kitchenCostImport;

    @Column(name = "ortherimport")
    private String ortherImport;

    @Column(name = "orthercostimport")
    private Integer ortherCostImport;
    
    @OneToMany(mappedBy = "Imports")
    private List<Supplier> supplier;
    
    @OneToMany(mappedBy = "Imports")
    private List<Report> report;
}
