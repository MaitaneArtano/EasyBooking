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
		System.out.println("Entra login autorizacion service");
		if(plataforma == 1)
		{
			return this.instanceGoogle.login(email, password);
		}else
		{
			return this.instanceFacebook.login(email, password);
		}
	}


	
}
