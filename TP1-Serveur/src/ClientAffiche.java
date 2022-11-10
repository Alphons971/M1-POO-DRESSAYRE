
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import javax.swing.JPanel;

public class ClientAffiche extends JPanel implements MouseListener {

	private static final long serialVersionUID = 1L;
	int active;
	JButton b1 = new JButton("Mes objets");
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(active == 1) {
			Serveur();
		}
	}

	private void Serveur() {
		// TODO Auto-generated method stub
		Serveur t = new Serveur();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
