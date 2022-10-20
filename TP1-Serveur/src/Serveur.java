import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Serveur {
	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		
	try {
		// On écoute sur le port <PORT>
		ServerSocket ecoute = new ServerSocket(61136);
		while (true) {
			// On accepte une demande de connexion d'un client
			Socket client=ecoute.accept();
			TestThread t = new TestThread(client);
			t.start();
			
		}
		
	}
	catch (IOException e) {
	System.err.println(e.getMessage());
	System.exit(1);
	} 
	}

}

