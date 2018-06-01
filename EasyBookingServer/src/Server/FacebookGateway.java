package Server;

import java.util.ArrayList;

import Data.Usuario;

public class FacebookGateway implements IAutorizacionGateway {

	private static ArrayList<String> usuarios = new ArrayList<String>();
	
	public FacebookGateway()
	{	
		
	}

	
	@Override
	public boolean login(String email, String password)  
	{
		
		System.out.println("Entra");
		boolean valido = false;
		ArrayList <Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		Usuario usuario = new Usuario("ainhoa@gmail.com", "ainhoa");
		Usuario usuario1 = new Usuario("ianire@gmail.com", "ianire");
		Usuario usuario2 = new Usuario("maitane@gmail.com", "maitane");
		Usuario usuario3 = new Usuario("jokin@gmail.com", "jokin");
		listaUsuarios.add(usuario3);
		listaUsuarios.add(usuario2);
		listaUsuarios.add(usuario1);
		listaUsuarios.add(usuario);
		
		for(int i=0; i<listaUsuarios.size(); i++)
		{
			if(email.equals(listaUsuarios.get(i).getEmail()))
			{
				System.out.println("El email coincide");
				if(password.equals(listaUsuarios.get(i).getPassword()))
				{
					System.out.println("Acceso permitido");
					valido = true;
				}
				
			}else
			{
				System.out.println("El email no coincide");
				valido = false;
			}
			
		}
		return valido;
	}

}
