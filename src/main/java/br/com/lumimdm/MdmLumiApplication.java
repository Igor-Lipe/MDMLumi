package br.com.lumimdm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class MdmLumiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MdmLumiApplication.class, args);
	}
}
