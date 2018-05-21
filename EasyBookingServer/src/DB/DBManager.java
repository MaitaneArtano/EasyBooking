package DB;

import java.util.ArrayList;
import java.util.List;

import Data.Usuario;
import Data.Vuelo;


public class DBManager 
{

	private static DBManager instance;
	
	//Hauekin duda, hemen eon behar due?
	private List<Vuelo> VueloCache;
	private List<Usuario> UsuarioCache;
	
	
	private DBManager() 
	{
		this.VueloCache = new ArrayList<>();
		this.UsuarioCache = new ArrayList<>();
		
		Usuario user1 = new Usuario();
		user1.setEmail("sample@gmail.com");	
		
		Usuario user2 = new Usuario();
		user2.setEmail("troyaikman08@hotmail.com");
	
		this.UsuarioCache.add(user1);
		this.UsuarioCache.add(user2);
		
		Vuelo vuelo1 = new Vuelo();
		vuelo1.setId_vuelo("A1");
		vuelo1.setFecha("03/04/2018");
		vuelo1.setOrigen("Santander");
		vuelo1.setDestino("Bali");
		
		Vuelo vuelo2 = new Vuelo();
		vuelo2.setId_vuelo("A1");
		vuelo2.setFecha("03/04/2018");
		vuelo2.setOrigen("Santander");
		vuelo2.setDestino("Bali");
		
	
		this.VueloCache.add(vuelo1);
		this.VueloCache.add(vuelo2);
		
	
	}
	

	public static DBManager getInstance() 
	{
		if (instance == null) {
			instance = new DBManager();
		}		
		
		return instance;
	}
	
	//Hemen arraylist bat bueltatzeola ustet
	public Vuelo getVuelo()
	{
		Vuelo vuelo = null;
		return vuelo;
	}
	
	public Vuelo getVueloDetails(String id_vuelo)
	{
		Vuelo vuelo = null;
		return vuelo;
	}
	
	public boolean store(Usuario usuario)
	{
		this.UsuarioCache.add(usuario);
		return true;
	}
	
	public Usuario getUsuario(String email) 
	{
		
		for (Usuario user : this.UsuarioCache) {
			if (user.getEmail().equalsIgnoreCase(email)) {
				return user;
			}
		}
		
		return null;
	}
	
	//Haure duda
	public List<Vuelo> getVuelos() 
	{
		return this.VueloCache;
	}

	
}
