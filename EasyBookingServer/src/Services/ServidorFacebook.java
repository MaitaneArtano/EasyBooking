package Services;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;


public class ServidorFacebook
{
	private Socket socket;
	private DataInputStream in;
	private DataOutputStream out;

	public ServidorFacebook(Socket socket) 
	{
		super();
		this.socket = socket;
		
		try {
			this.in = new DataInputStream(socket.getInputStream());
			this.out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			System.err.println("# EchoService - TCPConnection IO error: " + e.getMessage());
		}
	}
	
	public void run() 
	{
		//ServidorLogin
		try {
			//Read request from the client
			String data = this.in.readUTF();			
			System.out.println("   - ServidorLogin - Received data from '" + socket.getInetAddress().getHostAddress() + ":" + socket.getPort() + "' -> '" + data + "'");		
			
			String usuario = String.valueOf(this.login(data));
			
			//Send response to the client
			this.out.writeUTF(usuario.toUpperCase());			
			System.out.println("   - ServidorLogin - Sent data to '" + socket.getInetAddress().getHostAddress() + ":" + socket.getPort() + "' -> '" + data.toUpperCase() + "'");
		} catch (EOFException e) {
			System.err.println("   # ServidorLogin - TCPConnection EOF error" + e.getMessage());
		} catch (IOException e) {
			System.err.println("   # ServidorLogin - TCPConnection IO error:" + e.getMessage());
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				System.err.println("   # ServidorLogin - TCPConnection IO error:" + e.getMessage());
			}
		}
	}
		
		
		public boolean login(String usuario)
		{
			boolean a = false;
			return a;
		}
	
	
}
