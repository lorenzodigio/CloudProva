package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Utente;
import com.example.demo.repo.UtenteRepo;


@RestController
public class MainController {
	
	@Autowired
	public UtenteRepo utenteR;
	
	@GetMapping("/utente")
	public ResponseEntity<List<Utente>> utente() {
		
		 List<Utente> lista =utenteR.findAll();
		 return ResponseEntity.ok(lista);
	}
}
