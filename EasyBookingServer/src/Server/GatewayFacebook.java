package Server;

import java.io.IOException;
import java.net.Socket;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import Services.ServidorFacebook;

public class GatewayFacebook extends UnicastRemoteObject implements ILogin
{
	private static final long serialVersionUID = 1L;
	static ServidorFacebook server;
	static Socket socket;
	private boolean correcto = false;

	protected GatewayFacebook() throws RemoteException 
	{
		super();
		try {
			socket = new Socket("0.0.0.0", 4000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		server = new ServidorFacebook(socket);
	}

	@Override
	public void login(String email, String password, String serverIP, int serverPort) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean comprobarRegistro(String email, String password) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

}
