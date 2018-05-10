package Remote;

import java.rmi.RemoteException;
import java.util.List;

import DTO.VueloDTO;


public interface IRemoteFacade 
{
	public boolean login(String aEmail, String aPassword) throws RemoteException;
	public List<VueloDTO> getVuelos() throws RemoteException;
	List<VueloDTO> getVuelos(String vuelos) throws RemoteException;

}
