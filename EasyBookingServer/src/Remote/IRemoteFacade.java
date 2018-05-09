package Remote;

import java.rmi.RemoteException;

public interface IRemoteFacade 
{
	public boolean login(String aEmail, String aPassword) throws RemoteException;

}
