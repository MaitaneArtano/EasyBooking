package Remote;

import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
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

	@Override
	public List<Vuelo> getVuelos() 
	{
		return null;
	}
	
	

	
}
