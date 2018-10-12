package br.com.jeannascimento.spring.oauth.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import br.com.jeannascimento.spring.oauth.server.rest.OlaMundoController;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {OlaMundoController.class})
public class WebMvcConfig extends WebMvcConfigurationSupport {

   
}
