package Remote;

import java.util.ArrayList;

import Data.Vuelo;


public interface IVueloDAO 
{
	public void storeVuelo(Vuelo vuelo);
	public ArrayList<Vuelo> getVuelos();
	public Vuelo getVuelo(String id_vuelo);
	public void deleteVuelos();
	
	
}
