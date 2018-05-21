package Remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import DTO.CompleteVueloDTO;
import DTO.FacturaDTO;
import DTO.VueloDTO;
import Data.Usuario;
import Services.AuthorisationService;
import Services.VueloService;

public class RemoteFacade extends UnicastRemoteObject implements IRemoteFacade
{
	private static final long serialVersionUID = 1L;
	private static RemoteFacade instance;
	public Usuario state;

	
	private RemoteFacade() throws RemoteException 
	{
		super();
		
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

	@Override
	public boolean login(String email, String password) throws RemoteException 
	{
		
		return false;
	}

	@Override
	public boolean signin(String email, String password) throws RemoteException
	{


		return false;
	}

	@Override
	public List<VueloDTO> getVuelos() throws RemoteException 
	{
		
		return null;
	}

	@Override
	public List<FacturaDTO> compra(String id_vuelo, int num_tarjeta)
	{

		return null;
	}

	@Override
	public List<CompleteVueloDTO> getVueloDetails(String id_vuelo)
	{
		
		return null;
	}
	
	
	
	

}
