package Data;


import java.io.Serializable;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable(detachable = "true")

public class Usuario implements Serializable
{
	//falta la funcion de obtenerCompra()
	
	private String email;
	private String password;
	
	public Usuario(String email, String password)
	{
		super();
		this.email = email;
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
