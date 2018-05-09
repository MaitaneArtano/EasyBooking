package DB;

import java.util.ArrayList;
import java.util.List;

import Data.Usuario;
import Data.Vuelo;

public class DBManager 
{

	private static DBManager instance;
	
	private List<Vuelo> VueloCache;
	private List<Usuario> UsuarioCache;
	//private List<Pago> usersCache;
	//private List<Reserva> bidsCache;
	
	
	private DBManager() 
	{
		this.VueloCache = new ArrayList<>();
		this.UsuarioCache = new ArrayList<>();
		//this.usersCache = new ArrayList<>();
		//this.bidsCache =  new ArrayList<>();
		
		Usuario user1 = new Usuario();
		user1.setEmail("sample@gmail.com");
		user1.setPassword("12345");		
		
		Usuario user2 = new Usuario();
		user2.setEmail("troyaikman08@hotmail.com");
		user2.setPassword("12345");
	
		this.UsuarioCache.add(user1);
		this.UsuarioCache.add(user2);
		
		Vuelo vuelo1 = new Vuelo();
		vuelo1.setID_vuelo("A1");
		vuelo1.setFecha("03/04/2018");
		vuelo1.setCant_ticket(2);
		vuelo1.setOrigen("Santander");
		vuelo1.setDestino("Bali");
		
		Vuelo vuelo2 = new Vuelo();
		vuelo2.setID_vuelo("A1");
		vuelo2.setFecha("03/04/2018");
		vuelo2.setCant_ticket(2);
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
	
	public Usuario getUser(String email) {
		
		for (Usuario user : this.UsuarioCache) {
			if (user.getEmail().equalsIgnoreCase(email)) {
				return user;
			}
		}
		
		return null;
	}
	
}
