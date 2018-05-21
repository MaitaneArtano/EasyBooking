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
	

	public VueloDTO entityToDTO(Vuelo vuelo) 
	{
		VueloDTO dto = new VueloDTO();		
		dto.setId_vuelo(vuelo.getId_vuelo());
		dto.setPrecio(vuelo.getPrecio());
		return dto;
	}

	 //Hau organigraman eztao
	public List<VueloDTO> entityToDTO(List<Vuelo> vuelos) 
	{		
		List<VueloDTO> dtos = new ArrayList<>();
		
		for (Vuelo vuelo : vuelos) {
			dtos.add((VueloDTO) this.entityToDTO(vuelo));
		}
		
		return dtos;
	}
	

}
