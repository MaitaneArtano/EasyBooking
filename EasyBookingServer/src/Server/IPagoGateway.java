package Server;

public interface IPagoGateway 
{
	public boolean pago(int precio, String numTarjeta);
}
