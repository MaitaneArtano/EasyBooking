package Remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;
import DTO.CompleteVueloDTO;
import DTO.FacturaDTO;
import DTO.VueloDTO;
import Data.Usuario;
import Data.Vuelo;
import Services.AutorizacionService;
import Services.UsuarioService;
import Services.VueloService;

public class RemoteFacade extends UnicastRemoteObject implements IRemoteFacade
{
	private static final long serialVersionUID = 1L;
	private static RemoteFacade instance;
	public Usuario state;
	private PersistenceManagerFactory pmf;

	public RemoteFacade() throws RemoteException 
	{
		super();
		pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
	}
	
	public static RemoteFacade getInstance()  throws RemoteException
	{
		if (instance == null) 
		{
			try 
			{
				instance = new RemoteFacade();
			} catch (Exception ex) 
			{
				System.err.println("# Error creating RemoteFacade: " + ex);
			}
		}
		return instance;
	}
	
	
	@Override
	public boolean login(String email, String password, int plataforma) throws RemoteException 
	{
		boolean bool;
		System.out.println("Entra login remote facade. Plataforma: " + plataforma);
		bool = AutorizacionService.getInstance().login(email, password, plataforma);
		return bool;
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
	public List<FacturaDTO> compra(String id_vuelo, int num_tarjeta) throws RemoteException
	{

		return null;
	}

	@Override
	public List<CompleteVueloDTO> getVueloDetails(String id_vuelo)  throws RemoteException
	{
		
		return null;
	}

	@Override
	public void GuardarVuelos(List<Vuelo>listaVuelos) throws RemoteException
	{
		VueloService.getInstance().cogerVuelos(listaVuelos);
	}

	
}
