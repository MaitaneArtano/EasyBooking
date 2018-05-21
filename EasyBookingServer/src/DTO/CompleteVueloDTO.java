package DTO;

import java.io.Serializable;

public class CompleteVueloDTO implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id_vuelo;
	private float precio;
	private String origen;
	private String destino;
	private String fecha;
	
	
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
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
