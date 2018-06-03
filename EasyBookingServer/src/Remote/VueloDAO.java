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
	    	Query query = pm.newQuery("SELECT FROM " + Vuelo.class.getName() + " WHERE name == '" + id_vuelo + "'");
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
	public List<Vuelo> getVuelos() 
	{
		PersistenceManager pm = pmf.getPersistenceManager();
		
		Transaction tx = pm.currentTransaction();
		List<Vuelo> misVuelos = new ArrayList<>();
		
		try {
			System.out.println("   * Retrieving an Extent for Fligths.");
			
			tx.begin();			
			Extent<Vuelo> extent = pm.getExtent(Vuelo.class, true);
			
			for (Vuelo vuelo : extent)
			{
				misVuelos.add(vuelo);
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
		return misVuelos;
	}
	
	
	

	
}
