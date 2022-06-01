package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Demo1Configuration {

	@Bean
	public Inner1 inner1() {
		return new Inner1();
	}

	static class Inner1 {
	}
}
