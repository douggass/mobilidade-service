package com.mobilidade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobilidade.service.TransporteService;

@RestController
public class TransporteControllerV1 {

	@Autowired
	private TransporteService transporteService;

	@GetMapping
	public ResponseEntity<String> teste() {
		return ResponseEntity.ok(transporteService.listarLinhasOnibus());
	}

}
