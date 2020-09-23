package cn.enjoy;
import cn.enjoy.service.impl.ProductServiceImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@MapperScan("cn.enjoy.mapper")
@EnableDiscoveryClient
@EnableEurekaClient
@EnableAutoConfiguration
public class ProductApp{
    public static void main(String[] args) {
        SpringApplication.run(ProductApp.class,args);
    }
}