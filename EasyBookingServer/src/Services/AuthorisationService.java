package Services;

import Data.Usuario;

public class AuthorisationService 
{
	private static AuthorisationService instance;
	
	private AuthorisationService() { }
	
	public static AuthorisationService getInstance() {
		if (instance == null) {
			instance = new AuthorisationService();
		}
		
		return instance;
	}

	public Usuario login(String email, String password) 
	{
		return null;
	
	}

}
