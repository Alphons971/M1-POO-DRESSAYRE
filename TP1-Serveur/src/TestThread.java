import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TestThread extends Thread {
	private Socket client;
	public TestThread(Socket client) {
		this.client = client;
	}
	

			public void run() {
				try {
				OutputStream out = client.getOutputStream();
				ObjectOutputStream objOut = new ObjectOutputStream(out);
				InputStream in = client.getInputStream();
				ObjectInputStream objIn = new ObjectInputStream(in);
				Integer I= 3;
				objOut.writeObject(I);
				Integer O= (Integer)objIn.readObject();;
				System.out.println("Serveur:");
				System.out.println(O);
				client.close();
				}
				catch (IOException e) {
					System.err.println(e.getMessage());
					System.exit(1);
					} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		
		
	

}
