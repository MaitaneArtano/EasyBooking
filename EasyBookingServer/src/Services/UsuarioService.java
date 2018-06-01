package Services;

import DB.DBManager;
import Data.Usuario;

public class UsuarioService

{
	private static UsuarioService instance;
	private UsuarioService() {}
	
	public static UsuarioService getInstance()
	{
		if (instance == null)
		{
			instance = new UsuarioService();
		}
		
		return instance;
	}
	
	public boolean crearUsuario(String email, String password)
	{
		Usuario newUsuario = new Usuario(email, password);
		return DBManager.getInstance().storeUsuario(newUsuario);
	}
	
	public boolean login(String email, String password)
	{
		System.out.println("Entra login usuario service");
		return instance.login(email, password);
	}
}
