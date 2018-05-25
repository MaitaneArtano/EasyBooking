package Services;

import java.util.List;

import DB.DBManager;
import DTO.CompleteVueloDTO;
import DTO.VueloDTO;
import Utils.VueloAssembler;

public class VueloService 
{
	private static VueloService instance;

	private VueloService() { }
	
	public static VueloService getInstance() {
		if (instance == null) {
			instance = new VueloService();
		}

		return instance;
	}

	public List<VueloDTO> getVuelos() 
	{
		return null;
	}
	
	public List<VueloDTO> getVueloDetails(String id_vuelo) 
	{
		return null;
	}

	
	

}
