package com.proyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proyecto.Entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer>{
	
	@Query("Select e from Libro e where e.codigo like :var_fil")
	public List<Libro> listaPorCodigo(@Param("var_fil") String filtro);

}
