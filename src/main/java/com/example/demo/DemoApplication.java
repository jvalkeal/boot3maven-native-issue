package com.example.demo;

import com.example.demo.Demo1Configuration.Inner1;
import com.example.demo.Demo2Configuration.Inner2;

import org.springframework.aot.hint.annotation.Reflective;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	@Reflective
	Inner1 inner1;

	@Autowired
	@Reflective
	Inner2 inner2;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(inner1);
		System.out.println(inner2);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
