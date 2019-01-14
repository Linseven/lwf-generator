package top.linseven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.linseven.dao")
public class LinsevenApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinsevenApplication.class, args);
	}
}
