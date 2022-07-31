package view;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

import MusicLoader.MusicLoader;


public class MainView extends JFrame {

	private StartPanel startPanel;
	private MainPanel mainPanel;
	
	private MusicLoader musicLoader;
	

//Konstruktor

	public MainView() {
		
		musicLoader = new MusicLoader();
		musicLoader.load();
		
		
		this.setBounds(250, 0, 1024, 768);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
		this.setMainPanel(new MainPanel());
		this.setStartPanel(new StartPanel());
		this.setContentPane(this.getStartPanel());
		
		this.setVisible(true);
	}
	
	
	//Methoden
	
	
	//Action Listener hinzufügen
	public void addActionListenerToStartButton(ActionListener al) {
		this.getStartPanel().addActionListenerToStartButton(al);		
	}
	
	public void addActionListenerToProductButton(ActionListener al) {
		this.getMainPanel().getOfferPanel().getBtnProductDetail().addActionListener(al);	
	}
	
	

	//Panel Methoden
	public void showShoppingPanel() {
	
		this.setContentPane(this.getMainPanel());
		musicLoader.play(MusicLoader.sound);
	
	
	}
	

	public void showMainPanel() {
		this.getMainPanel().removeAll();
		
		
		this.add(getMainPanel().getHeaderPanel());
		this.add(getMainPanel().getCategoryPanel());
		this.add(getMainPanel().getOfferPanel());
		this.revalidate();
		this.repaint();
		
		
	}
	
	public void showWarenkorbPanel() {
		this.remove(this.getMainPanel().getOfferPanel());
		this.remove(this.getMainPanel().getProductPanel());
		
		
		this.getMainPanel().add(this.getMainPanel().getWarenkorbPanel());
	
		this.revalidate();
		this.repaint();
	
	}
	
	public void showProductPanel() {
		this.remove(this.getMainPanel().getOfferPanel());
		this.remove(this.getMainPanel().getWarenkorbPanel());
		
		this.getMainPanel().add(this.getMainPanel().getProductPanel());
	
		this.revalidate();
		this.repaint();
	}


	
	
	
	
	//Getter Setter


	public StartPanel getStartPanel() {
		return startPanel;
	}

	public void setStartPanel(StartPanel startPanel) {
		this.startPanel = startPanel;
	}


	public MainPanel getMainPanel() {
		return mainPanel;
	}


	public void setMainPanel(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}
}
