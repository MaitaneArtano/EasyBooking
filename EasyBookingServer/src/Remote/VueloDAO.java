package Remote;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;
import Data.Vuelo;


public class VueloDAO implements IVueloDAO
{
	
	private PersistenceManagerFactory pmf;
	
	public VueloDAO vue;

	public VueloDAO()
	{
		pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
	}
	
	@Override
	public void storeVuelo(Vuelo vuelo) 
	{
		
		this.storeGuardarVuelo(vuelo);
	}
	
	private void storeGuardarVuelo(Vuelo vuelo)
	{
		
		
		PersistenceManager pm = pmf.getPersistenceManager();
	    Transaction tx = pm.currentTransaction();
	    
	    //vue.deleteAllVuelos();
	   
	    try {
	       tx.begin();
	       System.out.println("   * Storing a flight: " + vuelo);
	       pm.makePersistent(vuelo);
	       tx.commit();
	    } catch (Exception ex) {
	    	System.out.println("   $ Error storing a flight: " + ex.getMessage());
	    } finally {
	    	if (tx != null && tx.isActive()) {
	    		tx.rollback();
	    	}
				
    		pm.close();
	    }
	}
	
	public Vuelo getVuelo(String id_vuelo)
	{
		PersistenceManager pm = pmf.getPersistenceManager();
		
		Transaction tx = pm.currentTransaction();
		Vuelo miVuelo = null;
	    
		try 
		{
			System.out.println ("   * Querying a Fligth: " + id_vuelo);
			
	    	tx.begin();
	    	//Hemen enao bate segura .getName() in behar danik
	    	Query query = pm.newQuery("SELECT FROM " + Vuelo.class.getName() + " WHERE VUELO_ID == '" + id_vuelo + "'");
	    	query.setUnique(true);
	    	miVuelo = (Vuelo)query.execute();	    
 	    	tx.commit();
   	    
	     } catch (Exception ex) 
		{
		   	System.out.println("   $ Error retreiving a fligth: " + ex.getMessage());
	     } finally
		{		   
	    	if (tx != null && tx.isActive())
		   	{
		   		tx.rollback();
		   	}
	   		pm.close();
	     }
	    return miVuelo;
	}

	@Override
	public ArrayList<Vuelo> getVuelos() 
	{
		PersistenceManager pm = pmf.getPersistenceManager();
		ArrayList<Vuelo>vuelos = new ArrayList<Vuelo>();
		
		Transaction tx = pm.currentTransaction();
		
		try {
			System.out.println("   * Retrieving an Extent for Fligths.");
			
			tx.begin();			
			Extent<Vuelo> extentP = pm.getExtent(Vuelo.class);
			Vuelo vuelo;
			int cont=0;
			for (Vuelo p : extentP)
			{
				vuelo = new Vuelo();
				vuelo.setId_vuelo(p.getId_vuelo());
				vuelo.setOrigen(p.getOrigen());
				vuelo.setDestino(p.getDestino());
				vuelo.setFecha(p.getFecha());
				vuelo.setPrecio(p.getPrecio());
				
				vuelos.add(vuelo);
			}
			tx.commit();			
		} catch (Exception ex) 
		{
	    	System.out.println("   $ Error retrieving an extent: " + ex.getMessage());
	    } finally {
	    	if (tx != null && tx.isActive()) {
	    		tx.rollback();
	    	}

    		pm.close();    		
	    }			
		return vuelos;
	}

	
	/*public void deleteAllVuelos() {
		 
		System.out.println("- Cleaning the DB...");			
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {		
		tx.begin();
		
		
		Extent<Vuelo> extentB = pm.getExtent(Vuelo.class, true);
		for (Vuelo b : extentB) {
			b.removeVuelos();
		}
		// Updating the database so changes are considered before commit
		pm.flush();				
		
		Query query1 = pm.newQuery(Vuelo.class);
		System.out.println(" * '" + query1.deletePersistentAll() + "' vuelos deleted from the DB.");			
		
		
		tx.commit();
		
	} catch (Exception ex) {
		System.err.println(" $ Error cleaning the DB: " + ex.getMessage());
		ex.printStackTrace();
	} finally {
		if (tx != null && tx.isActive()) {
			tx.rollback();
		}
		
		if (pm != null && !pm.isClosed()) {
			pm.close();
		}
	}
}*/

	

	
}
