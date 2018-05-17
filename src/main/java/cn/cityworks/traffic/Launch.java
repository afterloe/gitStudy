package cn.cityworks.traffic;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class Launch {

	public static void main(String[] args) {
		SpringApplication.run(Launch.class, args);
	}
}
