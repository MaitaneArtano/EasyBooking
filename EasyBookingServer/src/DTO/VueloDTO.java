package DTO;

import java.io.Serializable;

public class VueloDTO implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id_vuelo;
	private float precio;
	
	
	public String getId_vuelo() {
		return id_vuelo;
	}
	public void setId_vuelo(String id_vuelo) {
		this.id_vuelo = id_vuelo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	
	
}
