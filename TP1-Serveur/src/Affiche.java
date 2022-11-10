import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public  class Affiche implements ActionListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Affiche gui = new  Affiche();
        gui.intialiser();
	}
	
	JButton b = new JButton("Connexion");
	ClientAffiche client = new ClientAffiche();
	
    public void intialiser(){
            JFrame fen = new JFrame();
            fen.setSize(800,600);
            fen.setTitle("Client/Serveur");
            fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fen.setLocationRelativeTo(null);
            fen.setBackground(Color.white);
            
            //Récupération du contenu
            Container contenu = fen.getContentPane();
            
            JPanel fond = new JPanel();
            fond.setBackground(Color.cyan);

           
            
            fond.add(b);
            b.addActionListener(this);
            contenu.add(fond, BorderLayout.NORTH);
           
            client.addMouseListener(client);             
            contenu.add(client);
            
            //Rendre la fenetre visible
            fen.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b) {
			client.active = 1;
			System.out.println("Bouton");
		}
	}
    
    

    	
}
