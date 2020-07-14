package com.xiahao.druid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import javax.activation.DataSource;
@MapperScan("com.xiahao.druid.mapper")
@SpringBootApplication
@ComponentScan(basePackages ={"com.xiahao.druid.*"})
public class DruidApplication {

	public static void main(String[] args) {
		SpringApplication.run(DruidApplication.class, args);
	}

}
