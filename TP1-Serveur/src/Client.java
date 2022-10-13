import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket s=null;
		try { s=new Socket("localhost",61136); // Création du socket
		// Récupération des flux d’entrée/sortie
		OutputStream out = s.getOutputStream();
		ObjectOutputStream objOut = new ObjectOutputStream(out);
		InputStream in = s.getInputStream();
		ObjectInputStream objIn = new ObjectInputStream(in);
		Integer I= (Integer)objIn.readObject();
		System.out.println("Client:");
		System.out.println(I);
		//UnObjet O= new UnObjet("test") ;
		//objOut.writeObject(O);
		s.close();
		} catch (IOException e) {System.err.println(e);} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
