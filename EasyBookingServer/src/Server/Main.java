package Server;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;

import Remote.IRemoteFacade;
import Remote.RemoteFacade;


public class Main 
{

	public static void main(String[] args) 
	{
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}

		
		String name = "//" + args[0] + ":" + args[1] + "/" + args[2];		
		
		try 
		{
			IRemoteFacade remoteFacade = RemoteFacade.getInstance();
			
			Naming.rebind(name, (Remote) remoteFacade);
			System.out.println(" *  server '" + name + "' started!!");
		} catch (Exception ex) 
			{
			System.err.println(" #  Server Exception: " + ex.getMessage());
			}
		
		

	}

}
