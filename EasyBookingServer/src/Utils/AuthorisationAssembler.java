package Utils;



public class AuthorisationAssembler 
{
	
	private static AuthorisationAssembler instance;

	private AuthorisationAssembler() { }
	
	public static AuthorisationAssembler getInstance() 
	{
		if (instance == null) {
			instance = new AuthorisationAssembler();
		}
		return instance;
	}
	
	

}
