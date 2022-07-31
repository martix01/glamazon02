package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;

public class HeaderPanel extends JPanel {

	private JTextField suche;
	private JButton btnSuchen;
	private JButton btnGoToWarenkorb;
	BufferedImage img;



	public JTextField getSuche() {
		return suche;
	}

	public void setSuche(JTextField suche) {
		this.suche = suche;
	}

	public JButton getBtnSuchen() {
		return btnSuchen;
	}

	public void setBtnSuchen(JButton btnSuchen) {
		this.btnSuchen = btnSuchen;
	}

	
	public JButton getBtnGoToWarenkorb() {
		return btnGoToWarenkorb;
	}

	public void setBtnGoToWarenkorb(JButton btnGoToWarenkorb) {
		this.btnGoToWarenkorb = btnGoToWarenkorb;
	}
	
	
	public HeaderPanel() {
		this.setBounds(0, 0, 1024, 200);
		this.setBackground(Color.BLUE);
	
	
		this.setLayout(null);

		
		try {
			this.img = ImageIO.read(this.getClass().getResource("/glamazon-logo.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		
		
		this.setSuche(new JTextField());
		this.getSuche().setBounds(224, 84 , 439,20);
		this.add(this.getSuche());
		
		this.setBtnSuchen(new JButton("Suchen"));
		this.getBtnSuchen().setBounds(673, 77, 100, 34);
		this.add(this.getBtnSuchen());
		
		this.setBtnGoToWarenkorb(new JButton("Warenkorb"));
		this.getBtnGoToWarenkorb().setBounds(795, 57, 150, 75);
		this.add(this.getBtnGoToWarenkorb());
		
	}
	
	

	protected void paintComponent(Graphics g) {
	
		g.drawImage(img, 50, 50, 101, 101, null);
			
	}
	
	public void addActionListenertoWarenkorbButton(ActionListener al) {
		this.getBtnGoToWarenkorb().addActionListener(al);
	}
	


}
