package com.example.demo;

import com.example.demo.Demo1Configuration.Inner1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Demo2Configuration {

	@Configuration
	public static class Demo2InnerConfiguration {

		Demo2InnerConfiguration(Inner1 inner1) {
		}

		@Bean
		public Inner2 inner2() {
			return new Inner2();
		}
	}

	static class Inner2 {
	}

}
