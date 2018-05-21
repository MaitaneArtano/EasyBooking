package DTO;

import java.io.Serializable;

public class FacturaDTO implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int num_factura;
	private String id_vuelo;
	private float precio;
	
	
	public int getNum_factura() {
		return num_factura;
	}
	public void setNum_factura(int num_factura) {
		this.num_factura = num_factura;
	}
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
