package com.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.Entity.Libro;
import com.proyecto.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService{

	@Autowired
	private LibroRepository repository;
	
	@Override
	public List<Libro> listarTodos() {
		return repository.findAll();
	}

	@Override
	public List<Libro> listarPorCodigo(String filtro) {
		return repository.listaPorCodigo(filtro);
	}

}
