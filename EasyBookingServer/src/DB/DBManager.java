package DB;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

import Data.Usuario;
import Data.Vuelo;
import Remote.IUsuarioDAO;
import Remote.IVueloDAO;
import Remote.UsuarioDAO;
import Remote.VueloDAO;


public class DBManager 
{

	private static DBManager instance;
	private PersistenceManagerFactory pmf;
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
	
	
	public void storeVuelo(Vuelo vuelo)
	{
		System.out.println("Guardando vuelo...");
		vueloDAO = new VueloDAO();
		vueloDAO.storeVuelo(vuelo);	
	}
	
	public boolean storeUsuario(Usuario usuario)
	{
		usuarioDAO = new UsuarioDAO();
		usuarioDAO.storeUsuario(usuario);
		return true;
	}
	
	public Vuelo getVuelo(String id_vuelo)
	{
		ArrayList<Vuelo>vuelos = new ArrayList<Vuelo>();
		vuelos = vueloDAO.getVuelos();
		for(int i=0; i<vuelos.size(); i++)
		{
			if(vuelos.get(i).getId_vuelo().equals(id_vuelo))
			{
				return vuelos.get(i);
			}
		}
		System.out.println("Ningun vuelo ha coincidido");
		return null;
		
	}
	
	
	
}
	
	
