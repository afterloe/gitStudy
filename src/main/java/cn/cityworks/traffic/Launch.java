package cn.cityworks.traffic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Launch {

	public static void main(String[] args) {
		SpringApplication.run(Launch.class, args);
	}
}
