package com.Duplication.DuplicationApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DuplicationAppApplication {

	        public static Integer Duplication(Integer a)
		{
			return a* 2;
	       	}


	public static void main(String[] args) {
		SpringApplication.run(DuplicationAppApplication.class, args);
	}

}

