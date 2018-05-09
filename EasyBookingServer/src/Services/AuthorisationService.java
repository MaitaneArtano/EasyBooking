package Services;

import DB.DBManager;
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

	public Usuario login(String email, String password) {
		Usuario user = DBManager.getInstance().getUser(email);
		
		if (user != null && user.chekPassword(password)) {
			return user;
		} else {
			return null;
		}
	}

}
