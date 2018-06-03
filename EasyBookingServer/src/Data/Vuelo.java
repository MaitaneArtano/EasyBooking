package Data;


import java.io.Serializable;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable(detachable = "true")

public class Vuelo implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String id_vuelo;
	private String origen;
	private String destino;
	private int precio;
	private String fecha;
	
	public Vuelo(String id_vuelo, String origen, String destino, int precio, String fecha)
	{
		super();
		this.id_vuelo = id_vuelo;
		this.origen = origen;
		this.destino = destino;
		this.precio = precio;
		this.fecha = fecha;
	}
	public Vuelo()
	{
		
	}
	
	public String getId_vuelo() {
		return id_vuelo;
	}
	public void setId_vuelo(String id_vuelo) {
		this.id_vuelo = id_vuelo;
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
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}	
	
	
	
	

}
