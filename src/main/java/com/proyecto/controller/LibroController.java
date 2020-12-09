package com.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.Entity.Libro;
import com.proyecto.service.LibroService;

@RestController
@RequestMapping("/api/rest/libro")
public class LibroController {
	
	@Autowired
	private LibroService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Libro>> lista(){
		return ResponseEntity.ok(service.listarTodos());
	}
	
	@GetMapping("/porCodigo/{filtro}")
	public ResponseEntity<List<Libro>> listaPorCodigo(@PathVariable("filtro") String fil) {
		return ResponseEntity.ok(service.listarPorCodigo(fil + "%"));
	}

}
