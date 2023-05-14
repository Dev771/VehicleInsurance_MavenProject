package com.edu.VehicleManagementAppSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
public class VehicleInsuranceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleInsuranceAppApplication.class, args);
	}
}
