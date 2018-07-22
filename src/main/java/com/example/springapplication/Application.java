package com.example.springapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.LinkedHashMap;
import java.util.Map;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

        //需要新建对象来设置，稍显繁琐
//        SpringApplication springApplication = new SpringApplication(Application.class);
//        Map<String,Object> properties = new LinkedHashMap<>();
//        properties.put("server.port",0);//是参数可以使用的随机端口
//        springApplication.setDefaultProperties(properties);
//        springApplication.setWebApplicationType(WebApplicationType.REACTIVE);
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println(context.getBean(Application.class));
		System.out.println(context.getClass().getName());
		//new SpringApplicationBuilder(Application.class).properties("server.port=8888").run(args);
	}
}
