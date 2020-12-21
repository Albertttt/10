package com.example.ten;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@EnableBinding(ConsumerChannels.class)
public class TenApplication {

	public static void main(String[] args) {
		SpringApplication.run(TenApplication.class, args);
	}

}
