package Utils;

import java.util.ArrayList;
import java.util.List;

import DTO.VueloDTO;
import Data.Vuelo;

public class VueloAssembler
{
	private static VueloAssembler instance;

	private VueloAssembler() { }
	
	public static VueloAssembler getInstance() 
	{
		if (instance == null) {
			instance = new VueloAssembler();
		}
		return instance;
	}
	

	public VueloDTO entityToDTO(Vuelo vuelo) {
		VueloDTO dto = new VueloDTO();		
		dto.setID_vuelo(vuelo.getID_vuelo());
		dto.setPrecio_ticket(vuelo.getPrecio_ticket());
		dto.setDestino(vuelo.getDestino());
		dto.setFecha(vuelo.getFecha());
		dto.setOrigen(vuelo.getOrigen());
		dto.setPrecio_ticket(vuelo.getCant_ticket());
		return dto;
	}

	public List<VueloDTO> entityToDTO(List<Vuelo> vuelos) {		
		List<VueloDTO> dtos = new ArrayList<>();
		
		for (Vuelo vuelo : vuelos) {
			dtos.add((VueloDTO) this.entityToDTO(vuelo));
		}
		
		return dtos;
	}
	

}
