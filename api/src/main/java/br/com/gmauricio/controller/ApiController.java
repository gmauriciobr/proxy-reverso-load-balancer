package br.com.gmauricio.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	@Value("${api.name}")
	private String nomeApi;
	
	@GetMapping
	public ResponseEntity<?> on(){
		return ResponseEntity.ok("On Line em: " + nomeApi);
	}

}
