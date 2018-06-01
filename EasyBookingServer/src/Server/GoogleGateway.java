package Server;

import java.util.ArrayList;

import Data.Usuario;

public class GoogleGateway implements IAutorizacionGateway{

private static ArrayList<String> usuarios = new ArrayList<String>();
	
	public GoogleGateway()
	{
		ArrayList <Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		Usuario usuario = new Usuario("pablo@gmail.com", "pablo");
		Usuario usuario1 = new Usuario("ramon@gmail.com", "ramon");
		Usuario usuario2 = new Usuario("izaro@gmail.com", "izaro");
		Usuario usuario3 = new Usuario("andres@gmail.com", "andres");
		listaUsuarios.add(usuario3);
		listaUsuarios.add(usuario2);
		listaUsuarios.add(usuario1);
		listaUsuarios.add(usuario);	
		
	}
	
	
	@Override
	public boolean login(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
