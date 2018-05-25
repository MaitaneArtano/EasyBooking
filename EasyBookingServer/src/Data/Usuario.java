package Data;


import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable(detachable = "true")

public class Usuario
{
	//falta la funcion de obtenerCompra()
	
	private String email;
	
	public Usuario(String email)
	{
		super();
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
