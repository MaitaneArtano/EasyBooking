package Data;

public class Usuario
{
	//falta la funcion de obtenerCompra()
	
	private String email;
	private String password;
	private int NumTarjeta;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getNumTarjeta() 
	{
		return NumTarjeta;
	}
	public void setNumTarjeta(int numTarjeta) 
	{
		NumTarjeta = numTarjeta;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean chekPassword(String password) {
		return this.password.equals(password);
	}
	
	

}
