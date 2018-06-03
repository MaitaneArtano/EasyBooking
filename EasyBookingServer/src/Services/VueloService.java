package Services;

import DB.DBManager;
import DTO.CompleteVueloDTO;
import Data.Vuelo;
import Server.FacebookGateway;
import Server.GoogleGateway;
import Server.PaypalGateway;
import Server.VISAGateway;

public class VueloService
{
	private static VueloService instance;
	private static VISAGateway instanceVisa;
	private static PaypalGateway instancePaypal;
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
	
	public boolean pago(int precio, String num_tarjeta, int metodo)
	{
		System.out.println("Entra login vuelo service. metodo: " + metodo);
		boolean bool;
		if(metodo == 1)
		{
			System.out.println("Pago con Visa");
			bool = instanceVisa.pago(precio, num_tarjeta); 
			System.out.println("Boolean: " + bool);
			return bool;
		}else
		{
			System.out.println("Pago con paypal");
			bool = instancePaypal.pago(precio, num_tarjeta);
			return bool;
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
