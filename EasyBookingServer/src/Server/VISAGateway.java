package Server;

public class VISAGateway implements IPagoGateway {

	@Override
	public boolean pago(int precio, String numTarjeta) {
		// TODO Auto-generated method stub
		
		System.out.println("Visa efectua el pago");
		return true;
		
	}

}
