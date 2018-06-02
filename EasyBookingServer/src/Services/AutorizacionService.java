package Services;

import java.rmi.RemoteException;

import Server.FacebookGateway;
import Server.GoogleGateway;
import Server.IAutorizacionGateway;


public class AutorizacionService implements IAutorizacionGateway
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
			return AutorizacionService.instanceGoogle.login(email, password); // hemen berez this.instanceGoogle... zeon
		}else
		{
			return AutorizacionService.instanceFacebook.login(email, password);
		}
	}


	@Override
	public boolean login(String email, String password) 
	{
		
		
		return true;
	}
	
	

	
}
