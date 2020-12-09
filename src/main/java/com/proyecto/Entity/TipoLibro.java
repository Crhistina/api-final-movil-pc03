package com.proyecto.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipolibro")
public class TipoLibro {
	
	@Id
	private int IdTipoLibro;
	private String nombre;
	private String estado;
	
	public int getIdTipoLibro() {
		return IdTipoLibro;
	}
	public void setIdTipoLibro(int idTipoLibro) {
		IdTipoLibro = idTipoLibro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
