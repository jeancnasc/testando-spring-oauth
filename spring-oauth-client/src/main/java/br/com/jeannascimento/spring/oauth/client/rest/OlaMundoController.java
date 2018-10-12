package br.com.jeannascimento.spring.oauth.client.rest;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;

@RestController
@RequestMapping("/olamundo")
public class OlaMundoController {
	
	private String urlAuth = "http://localhost:8080/spring-oauth-auth-server/olamundo";
	private String urlResource = "http://localhost:8082/spring-oauth-resource-server/olamundo";
	
	@Autowired
	@Qualifier("clienteOAuthRestTemplate")
	private RestOperations restOperations;
	
	@GetMapping(path = "/auth-server")
	public String getAuth(){
		return "Resposta: " + restOperations.getForObject(URI.create(urlAuth), String.class);
	}

	@GetMapping(path = "/resource-server")
	public String getResource(){
		return "Resposta: " + restOperations.getForObject(URI.create(urlResource), String.class);
	}

}
