package Remote;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;
import Data.Usuario;

public class UsuarioDAO implements IUsuarioDAO
{

	private PersistenceManagerFactory pmf;

	public UsuarioDAO()
	{
		pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
	}
	
	@Override
	public void storeUsuario(Usuario usuario) 
	{
		this.storeGuardarUsuario(usuario);
	}
	
	private void storeGuardarUsuario(Usuario usuario)
	{
		PersistenceManager pm = pmf.getPersistenceManager();
	    Transaction tx = pm.currentTransaction();
	   
	    try {
	       tx.begin();
	       System.out.println("   * Storing a user: " + usuario);
	       pm.makePersistent(usuario);
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
}
