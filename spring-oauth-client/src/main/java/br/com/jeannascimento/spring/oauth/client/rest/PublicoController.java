package br.com.jeannascimento.spring.oauth.client.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publico")
public class PublicoController {

	@GetMapping
	public String get(){
		return "Área pública";
	}
}
