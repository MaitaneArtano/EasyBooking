package Services;

import DB.DBManager;
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
		for(int i=0; i<listaVuelos.size();i++)
		{
			this.crearVuelo(listaVuelos.get(i));
		}
		
	}

	public void crearVuelo(Vuelo newVuelo)
	{
		DBManager.getInstance().storeVuelo(newVuelo);
	}


}
