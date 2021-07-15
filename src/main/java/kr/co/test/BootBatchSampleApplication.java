package kr.co.test;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableBatchProcessing
@SpringBootApplication
public class BootBatchSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootBatchSampleApplication.class, args);
	}

}
