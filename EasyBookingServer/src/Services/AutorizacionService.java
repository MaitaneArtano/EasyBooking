package Services;

import java.rmi.RemoteException;

import Server.IAutorizacionGateway;


public class AutorizacionService implements IAutorizacionGateway {
	
	private static AutorizacionService instance;

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
	
	public boolean login(String email, String password)
	{
		
		boolean resultado=instance.login(email, password);
		return resultado;
		
		
		
		
	}
	
}
