package DTO;

public class VueloDTO 
{

	private String ID_vuelo;
	private String Fecha;
	private int cant_ticket;
	private String origen;
	private String destino;
	private int precio_ticket;
	public String getID_vuelo() {
		return ID_vuelo;
	}
	public void setID_vuelo(String iD_vuelo) {
		ID_vuelo = iD_vuelo;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public int getCant_ticket() {
		return cant_ticket;
	}
	public void setCant_ticket(int cant_ticket) {
		this.cant_ticket = cant_ticket;
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
	public int getPrecio_ticket() {
		return precio_ticket;
	}
	public void setPrecio_ticket(int precio_ticket) {
		this.precio_ticket = precio_ticket;
	}
	
	
	
}
