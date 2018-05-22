package Data;


import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable (detachable = "true")

public class Vuelo 
{
	
	private String id_vuelo;
	private String origen;
	private String destino;
	private int precio;
	private String fecha;
	
	
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
