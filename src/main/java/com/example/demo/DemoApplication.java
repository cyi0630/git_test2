package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Syst1em.out.println("aaa -> bbb develop 수정");
		System.out.println("develop 추가 - master에서는 삭제했는데 develop에서 수정함");
		Syst1em.out.println("develop 추가222");
	}

}
