import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Serveur  {
	private static Integer port= 52853;
	
	private static ArrayList<Object> liste_send=new ArrayList<Object>();
	private static ArrayList<Object> liste_receive=new ArrayList<Object>();
	
	

	public static void main(String[] args) 
	{
		//TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			Point p=new Point();
			Segment s=new Segment();
			liste_send.add(s);
			liste_send.add(p);
		}
		ServerSocket ecoute;
		
		try 
		{
			// On �coute sur le port <PORT>
			ecoute=new ServerSocket(port);
			System.out.println("S >>> Lancement du serveur");
			while (true) 
			{
				
				// On accepte une demande de connexion d'un client
				System.out.println("S >>> En attente de connexion");
				Socket client=ecoute.accept();
				System.out.println("S >>> Client connect�");
				// Cr�ation du thread
				System.out.println("S >>> Cr�ation du thread");
				TestThread t=new TestThread(client,liste_send,liste_receive);
				System.out.println("S >>> Lancement du thread");
				t.start();
			}
		}
		catch (IOException e) {
		 System.err.println(e.getMessage());
		 System.out.println("ici");
		 System.exit(1);
		}
			
		
		
			

	}

}








