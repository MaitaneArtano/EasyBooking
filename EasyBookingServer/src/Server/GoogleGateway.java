package Server;

import java.util.ArrayList;

import Data.Usuario;

public class GoogleGateway implements IAutorizacionGateway
{	
	public GoogleGateway()
	{
				
	}	
	
	@Override
	public boolean login(String email, String password) 
	{
		System.out.println("Entra login de Google");
		boolean valido = false;
		
		ArrayList <Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		Usuario usuario = new Usuario("pablo@gmail.com", "pablo");
		Usuario usuario1 = new Usuario("ramon@gmail.com", "ramon");
		Usuario usuario2 = new Usuario("izaro@gmail.com", "izaro");
		Usuario usuario3 = new Usuario("andres@gmail.com", "andres");
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
