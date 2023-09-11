package Grupo8.servicio;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
@ComponentScan("Grupo8")
public class ServicioApplication implements WebApplicationInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ServicioApplication.class, args);
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

	}
}
