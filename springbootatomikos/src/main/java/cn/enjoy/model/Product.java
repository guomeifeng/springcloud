package cn.enjoy.model;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data @ToString
@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long productId;
    @Column(name = "product_name", length = 24, nullable = false)
    private String productName;
    @Column(name = "product_desc", length = 40, nullable = false)
    private String productDesc;
}