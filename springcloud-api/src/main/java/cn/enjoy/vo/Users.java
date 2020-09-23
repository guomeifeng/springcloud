package cn.enjoy.vo;
import lombok.Data;

import java.io.Serializable;
@Data
public class Users implements Serializable {
    private String name;
    private int age;
    private String sex;

}