package Remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import Data.Usuario;
import Services.AuthorisationService;



public class RemoteFacade extends UnicastRemoteObject implements IRemoteFacade
{
	private static final long serialVersionUID = 1L;
	private static RemoteFacade instance;
	public Usuario state;

	
	private RemoteFacade() throws RemoteException 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static RemoteFacade getInstance() {
		if (instance == null) {
			try {
				instance = new RemoteFacade();
			} catch (Exception ex) {
				System.err.println("# Error creating RemoteFaçade: " + ex);
			}
		}
		
		return instance;
	}
	
	public boolean login(String email, String password) {		
		this.state = AuthorisationService.getInstance().login(email, password);
		
		return state != null;
	}

	
	
	

}
