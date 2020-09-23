package cn.enjoy.model;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
@Entity
@Data
public class Users {

    @Column(name = "id", length = 24, nullable = false)
    @Id
    private Integer id;
    @Column(name = "password", length = 100, nullable = false)
    private String passwd;
    @Column(name = "name", length = 24, nullable = false)
    private String username;
}