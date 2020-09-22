package com.example.Product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@EnableBinding(Processor.class)
@EnableBinding(KafkaProcessor.class)
public class ProductApplication {
	private static ApplicationContext applicationContext;
	public static void main(String[] args) {
		applicationContext = SpringApplication.run(ProductApplication.class, args);
	}

	public static KafkaProcessor getBeanForProcessor(){
		return applicationContext.getBean(KafkaProcessor.class);
	}

}
