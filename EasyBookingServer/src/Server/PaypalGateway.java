package Server;

public class PaypalGateway implements IPagoGateway{

	@Override
	public boolean pago(int precio, String numTarjeta) {
		// TODO Auto-generated method stub
		
		System.out.println("Paypal efectua el pago");
		return true;
	}

	
	
}
