package com.proyecto.service;

import java.util.List;

import com.proyecto.Entity.Libro;

public interface LibroService {
	
	public List<Libro> listarTodos();
	public List<Libro> listarPorCodigo(String filtro);

}
