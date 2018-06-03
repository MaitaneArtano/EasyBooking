package Services;

import DB.DBManager;
import DTO.CompleteVueloDTO;
import Data.Vuelo;

public class VueloService
{
	private static VueloService instance;
	private VueloService() {}
	
	public static VueloService getInstance()
	{
		if (instance == null)
		{
			instance = new VueloService();
		}
		return instance;
	}
	
	public void cogerVuelos(java.util.List<Vuelo> listaVuelos)
	{
		System.out.println("Entra VueloService cogerVuelos");
		for(int i=0; i<listaVuelos.size();i++)
		{
			this.crearVuelo(listaVuelos.get(i));
		}
		
	}

	public void crearVuelo(Vuelo newVuelo)
	{
		DBManager.getInstance().storeVuelo(newVuelo);
	}
	
	public void deleteVuelos()
	{
		DBManager.getInstance().deleteVuelos();
	}
	
	public CompleteVueloDTO buscarVuelo(String id_vuelo)
	{
		Vuelo miVuelo = new Vuelo();
		miVuelo = DBManager.getInstance().getVuelo(id_vuelo);
		
		CompleteVueloDTO miVueloDTO = new CompleteVueloDTO();
		miVueloDTO.setId_vuelo(miVuelo.getId_vuelo());
		miVueloDTO.setOrigen(miVuelo.getOrigen());
		miVueloDTO.setDestino(miVuelo.getDestino());
		miVueloDTO.setFecha(miVuelo.getFecha());
		miVueloDTO.setPrecio(miVuelo.getPrecio());
		
		return miVueloDTO;
	}


}
