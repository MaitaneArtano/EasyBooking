package Server;

import java.rmi.RemoteException;

public interface IAutorizacionGateway{

	
	public boolean login(String email, String password);
}
