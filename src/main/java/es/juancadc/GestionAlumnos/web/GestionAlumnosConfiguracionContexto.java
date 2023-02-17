package es.juancadc.GestionAlumnos.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan
@EnableWebMvc
public class GestionAlumnosConfiguracionContexto {

	
	@Bean
    public ViewResolver mapeo(){
        InternalResourceViewResolver irvr = new InternalResourceViewResolver();
        irvr.setPrefix("/vistas/");
        irvr.setSuffix(".jsp");
        return irvr;
	}
}
