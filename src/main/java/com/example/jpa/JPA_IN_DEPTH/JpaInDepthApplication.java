package com.example.jpa.JPA_IN_DEPTH;

import com.example.jpa.JPA_IN_DEPTH.respositry.CourseRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaInDepthApplication implements CommandLineRunner {

	@Autowired
	CourseRepo courseRepo;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public static void main(String[] args) {
		SpringApplication.run(JpaInDepthApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("user find -> {}" , courseRepo.findById(1001L));


	}
}
