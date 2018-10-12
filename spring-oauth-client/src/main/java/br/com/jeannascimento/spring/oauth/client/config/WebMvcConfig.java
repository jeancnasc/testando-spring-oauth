package br.com.jeannascimento.spring.oauth.client.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import br.com.jeannascimento.spring.oauth.client.rest.OlaMundoController;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = OlaMundoController.class)
public class WebMvcConfig extends WebMvcConfigurationSupport {
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
