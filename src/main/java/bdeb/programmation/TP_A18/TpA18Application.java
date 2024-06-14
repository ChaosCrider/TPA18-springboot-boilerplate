package bdeb.programmation.TP_A18;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TpA18Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TpA18Application.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TpA18Application.class);
	}

}
