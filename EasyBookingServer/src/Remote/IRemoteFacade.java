package Remote;

import java.rmi.RemoteException;
import java.util.List;

import DTO.VueloDTO;
import Data.Vuelo;
import DTO.FacturaDTO;
import DTO.CompleteVueloDTO;


public interface IRemoteFacade 
{
	public boolean login(String email, String password) throws RemoteException;
	public boolean signin(String email, String password) throws RemoteException;
	
	public List<VueloDTO> getVuelos() throws RemoteException;
	public List<CompleteVueloDTO> getVueloDetails(String id_vuelo);
	public void GuardarVuelo(String id_vuelo, String origen, String destino, int precio, String fecha);
	public List<FacturaDTO> compra(String id_vuelo, int num_tarjeta);

}
