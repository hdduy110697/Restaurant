package vn.com.restaurant.entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "Salary")
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //khoa phu toi bang nhan vien

    @Column(name = "salaryaday")
    private  Integer salaryADay;

    @Column(name = "numberday")
    private  Integer numberDay;

    @Column(name = "overTime")
    private  Integer overTime;

    @Column(name = "rewardsalary")
    private  Integer rewardSalary;

    @Column(name = "punishsalary")
    private Integer punishSalary;

    @Column(name = "salaryadvance")
    private Integer salaryAdvance;

    @Column(name = "paySalary")
    private Integer paySalary;

    @Column(name = "status")
    private Integer status;//1= da thanh toan, 2 = chua thanh toan
    @ManyToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;
}
