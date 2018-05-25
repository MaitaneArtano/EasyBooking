package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ILogin extends Remote
{
	public void login(String email, String password, String serverIP, int serverPort) throws RemoteException;
	public boolean comprobarRegistro(String email, String password) throws RemoteException;
}
