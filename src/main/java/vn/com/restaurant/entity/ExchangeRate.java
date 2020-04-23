package vn.com.restaurant.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "ExchangeRate")
public class ExchangeRate {
    @Id
    private Date date;
    @Column(name = "dolar")
    private Integer Dolar;
    @Column(name = "VND")
    private Integer VND;
}
