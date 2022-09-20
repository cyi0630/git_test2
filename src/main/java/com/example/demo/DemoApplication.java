package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//develop
		Syst1em.out.println("aaa -> bbb develop 수정");
		System.out.println("develop 추가 - master에서는 삭제했는데 develop에서 수정함");
		Syst1em.out.println("develop 추가222");
		Syst1em.out.println("develop 추가333");
		//master
		System.out.println("aaa -> bbb develop 수정");
		System.out.println("master 추가");
		System.out.println("master2 추가");

		System.out.println("develop3 추가");
		System.out.println("master3 추가");
		System.out.println("master4 추가");
		System.out.println("master5 추가");
	}

}
