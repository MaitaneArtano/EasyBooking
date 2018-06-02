package Services;

import java.rmi.RemoteException;

import Server.FacebookGateway;
import Server.GoogleGateway;

public class AutorizacionService
{
	
	private static AutorizacionService instance;
	private static GoogleGateway instanceGoogle;
	private static FacebookGateway instanceFacebook;

	public static AutorizacionService getInstance()  throws RemoteException
	{
		if (instance == null) 
		{
			try 
			{
				instance = new AutorizacionService();
				
			} catch (Exception ex) 
			{
				System.err.println("# Error creating AutorizacionService: " + ex);
			}
		}
		
		return instance;
	}
	
	
	public boolean login(String email, String password, int plataforma)
	{
		System.out.println("Entra login autorizacion service. Plataforma: " + plataforma);
		boolean bool;
		if(plataforma == 1)
		{
			System.out.println("Voy a Facebook");
			bool = instanceGoogle.login(email, password); // hemen berez this.instanceGoogle... zeon
			System.out.println("Boolean: " + bool);
			return bool;
		}else
		{
			System.out.println("Voy a Google");
			bool = instanceFacebook.login(email, password);
			return bool;
		}
	}
	

	
}
