package Remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

import DTO.CompleteVueloDTO;
import DTO.FacturaDTO;
import DTO.VueloDTO;
import Data.Usuario;
import Data.Vuelo;
import Server.ILogin;
import Services.UsuarioService;


public class RemoteFacade extends UnicastRemoteObject implements IRemoteFacade
{
	private static final long serialVersionUID = 1L;
	private static RemoteFacade instance;
	public Usuario state;
	private PersistenceManagerFactory pmf;
	private ILogin objGatewayLogin;

	
	private RemoteFacade() throws RemoteException 
	{
		super();
		pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
	}
	
	public static RemoteFacade getInstance() 
	{
		if (instance == null) 
		{
			try 
			{
				instance = new RemoteFacade();
			} catch (Exception ex) 
			{
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
		return UsuarioService.getInstance().crearUsuario(email, password);
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

	@Override
	public void GuardarVuelo(String id_vuelo, String origen, String destino, int precio, String fecha)
	{
		// TODO Auto-generated method stub
		
	}



	
}
