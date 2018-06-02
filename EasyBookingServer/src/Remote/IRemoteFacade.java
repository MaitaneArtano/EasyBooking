package Remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import DTO.VueloDTO;
import DTO.FacturaDTO;
import DTO.CompleteVueloDTO;


public interface IRemoteFacade extends Remote
{
	
	public boolean login(String email, String password, int plataforma) throws RemoteException;
	public boolean signin(String email, String password) throws RemoteException;
	
	public List<VueloDTO> getVuelos() throws RemoteException;
	public List<CompleteVueloDTO> getVueloDetails(String id_vuelo) throws RemoteException;
	public void GuardarVuelo(String id_vuelo, String origen, String destino, int precio, String fecha) throws RemoteException;
	public List<FacturaDTO> compra(String id_vuelo, int num_tarjeta) throws RemoteException;

}
