package Server;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;

import Data.Vuelo;
import Remote.RemoteFacade;
import Remote.VueloDAO;

public class IntroducirVuelos
{
	private static IntroducirVuelos instance = new IntroducirVuelos();
	private List<Vuelo> listaVuelos;
	
	
	
	
	private IntroducirVuelos()
	{
		this.listaVuelos = new ArrayList<>();
		System.out.println("  - Executing the eager constructor ...");
	}
	
	public static IntroducirVuelos getInstance()
	{
		System.out.println("  - Returning the only instance that can be instantiated ...");
		return instance;
	}
	
	public void insertarVuelos()
	{
		//id_vuelo, origen, destino, precio fecha
		Vuelo vuelo1 = new Vuelo("1", "Bilbao", "San Francisco", 670, "01/04/2019");
		Vuelo vuelo2 = new Vuelo("2", "Madrid", "Londres", 23, "06/06/2018");
		Vuelo vuelo3 = new Vuelo("3", "Barcelona", "Varsovia", 30, "05/07/2019");
		Vuelo vuelo4 = new Vuelo("4", "Paris", "Toronto", 780, "10/12/2018");
		listaVuelos.add(vuelo4);
		listaVuelos.add(vuelo3);
		listaVuelos.add(vuelo2);
		listaVuelos.add(vuelo1);
		instance.mandarABD(listaVuelos);
	}
	public void mandarABD(List<Vuelo> listaVuelos)
	{
		try 
		{
			RemoteFacade.getInstance().DeleteVuelos();
			RemoteFacade.getInstance().GuardarVuelos(listaVuelos);
		} catch (RemoteException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

