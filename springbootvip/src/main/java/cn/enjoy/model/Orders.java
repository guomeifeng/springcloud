package cn.enjoy.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "orders")
@Entity
@Data
public class Orders {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "customer_name", length = 24, nullable = false)
    private String name;
    @Column(name = "customer_id", nullable = false)
    private Integer userId;
    @Column(name = "account", nullable = true)
    private Integer account;

}