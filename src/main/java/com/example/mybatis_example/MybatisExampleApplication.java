package com.example.mybatis_example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.example.mybatis_example.mapper")
@SpringBootApplication
public class MybatisExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisExampleApplication.class, args);
	}

}
