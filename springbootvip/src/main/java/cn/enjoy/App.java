package cn.enjoy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
//@MapperScan(basePackages = "cn.enjoy.dao", sqlSessionFactoryRef = "test1SqlSessionFactory")
@EnableTransactionManagement
public class App  extends SpringBootServletInitializer {


    public static void main(String[] args){
        SpringApplication.run(App.class);
    }

}
