package Utils;

public class PaymentAssembler 
{
	
	private static PaymentAssembler instance;

	private PaymentAssembler() { }
	
	public static PaymentAssembler getInstance() 
	{
		if (instance == null) {
			instance = new PaymentAssembler();
		}
		return instance;
	}
	

}
