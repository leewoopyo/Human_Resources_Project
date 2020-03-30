package kr.ac.kopo.ctc.spring.Human_Resources;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class HumanResourcesProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanResourcesProjectApplication.class, args);
	}

}
