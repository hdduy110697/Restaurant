package vn.com.restaurant.entity;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "EmployeeTimesheet")
public class EmployeeTimesheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStaff;

    @Column(name = "month")
    private Integer month;

    @Column(name = "part")
    private String part;

    @ColumnDefault ("1")
    private Integer n1;

    @ColumnDefault ("2")
    private Integer n2;

    @ColumnDefault ("3")
    private Integer n3;

    @ColumnDefault ("4")
    private Integer n4;

    @ColumnDefault ("5")
    private Integer n5;

    @ColumnDefault ("6")
    private Integer n6;
    @ColumnDefault ("7")
    private Integer n7;
    @ColumnDefault ("8")
    private Integer n8;
    @ColumnDefault ("9")
    private Integer n9;
    @ColumnDefault ("10")
    private Integer n10;
    @ColumnDefault ("11")
    private Integer n11;
    @ColumnDefault ("12")
    private Integer n12;
    @ColumnDefault ("13")
    private Integer n13;
    @ColumnDefault ("14")
    private Integer n14;
    @ColumnDefault ("15")
    private Integer n15;
    @ColumnDefault ("16")
    private Integer n16;
    @ColumnDefault ("17")
    private Integer n17;
    @ColumnDefault ("18")
    private Integer n18;
    @ColumnDefault ("19")
    private Integer n19;
    @ColumnDefault ("20")
    private Integer n20;
    @ColumnDefault ("21")
    private Integer n21;
    @ColumnDefault ("22")
    private Integer n22;
    @ColumnDefault ("23")
    private Integer n23;
    @ColumnDefault ("24")
    private Integer n24;
    @ColumnDefault ("25")
    private Integer n25;
    @ColumnDefault ("26")
    private Integer n26;
    @ColumnDefault ("27")
    private Integer n27;
    @ColumnDefault ("28")
    private Integer n28;
    @ColumnDefault ("29")
    private Integer n29;
    @ColumnDefault ("30")
    private Integer n30;
    @ColumnDefault ("31")
    private Integer n31;

    @Column(name = "overtime")
    private Integer overTime;


}
