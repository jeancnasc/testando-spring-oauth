package br.com.jeannascimento.spring.oauth.server.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/olamundo")
public class OlaMundoController {

	@GetMapping
	public String get(){
		return "Olá Mundo! (oauth server)";
	}
}
