package view;

import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class MainView extends JFrame {

	private StartPanel startPanel;
	private MainPanel mainPanel;
	
	

//Konstruktor

	public MainView() {
		this.setBounds(250, 0, 1024, 768);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
		this.setMainPanel(new MainPanel());
		this.setStartPanel(new StartPanel());
		this.setContentPane(this.getStartPanel());
		
		this.setVisible(true);
	}
	
	
	//Methoden

	public void addActionListenerToStartButton(ActionListener al) {
		this.getStartPanel().addActionListenerToStartButton(al);		
	}
	
	
	public void addActionListenerToProductButton(ActionListener al) {
		this.getMainPanel().getOfferPanel().getBtnProductDetail().addActionListener(al);	
	}
	
	

	public void showShoppingPanel() {
		this.setContentPane(this.getMainPanel());
	
	}
	
	//toDo back Button methode
	public void addActionListenerToReturnToStartButton(ActionListener al) {
		
	}
	
	
	public void showStartPanel() {
		this.setContentPane(this.getStartPanel());
		
	}
	
	public void showProductPanel() {
		this.remove(this.getMainPanel().getOfferPanel());
		
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
