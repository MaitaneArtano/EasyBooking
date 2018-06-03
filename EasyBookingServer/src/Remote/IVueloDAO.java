package Remote;

import java.util.List;

import Data.Vuelo;


public interface IVueloDAO 
{
	public void storeVuelo(Vuelo vuelo);
	public List<Vuelo> getVuelos();
	public Vuelo getVuelo(String id_vuelo);
	
	public void deleteAllVuelos();
}
