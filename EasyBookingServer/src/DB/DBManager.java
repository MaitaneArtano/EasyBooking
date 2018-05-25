package DB;

import java.util.ArrayList;
import java.util.List;

import Data.Vuelo;
import Remote.IUsuarioDAO;
import Remote.IVueloDAO;
import Remote.UsuarioDAO;
import Remote.VueloDAO;


public class DBManager 
{

	private static DBManager instance;
	IVueloDAO vueloDAO;
	IUsuarioDAO usuarioDAO;
	
	
	private DBManager() 
	{
		usuarioDAO = new UsuarioDAO();
		vueloDAO = new VueloDAO();
		
	}

	public static DBManager getInstance() 
	{
		if (instance == null) {
			instance = new DBManager();
		}		
		
		return instance;
	}
	
	
	public void GuardarVuelo(String id_vuelo, String origen, String destino, int precio, String fecha)
	{
		Vuelo vuelo;
		vuelo = new Vuelo(id_vuelo, origen, destino, precio, fecha);
		
		vueloDAO = new VueloDAO();
		vueloDAO.storeVuelo(vuelo);
		
	}
}
	
	
