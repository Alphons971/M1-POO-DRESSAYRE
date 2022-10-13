import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
	public static void main(String[] args){
		// TODO Auto-generated method stub
	try {
		// On écoute sur le port <PORT>
		ServerSocket ecoute = new ServerSocket(61136);
		while (true) {
		// On accepte une demande de connexion d'un client
		Socket client=ecoute.accept();
		OutputStream out = client.getOutputStream();
		ObjectOutputStream objOut = new ObjectOutputStream(out);
		InputStream in = client.getInputStream();
		ObjectInputStream objIn = new ObjectInputStream(in);
		Integer I= 3;
		objOut.writeObject(I);
		//UnObjet O= (UnObjet)objIn.readObject();
		client.close();
		}
	}
	catch (IOException e) {
	System.err.println(e.getMessage());
	System.exit(1);
	} 
	}

}

