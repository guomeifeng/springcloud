package cn.enjoy.vo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@Data @ToString
public class Product implements Serializable {

    private Long productId;
    private String productName;
    private String productDesc;

}