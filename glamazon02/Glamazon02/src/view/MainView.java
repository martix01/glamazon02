package view;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MainView extends JFrame {

	private ShoppingPanel shoppingPanel;
	private StartPanel startPanel;
	private OfferPanel offerpanel;
	private ProductPanel productPanel;
	

//Konstruktor

	public MainView() {
		this.setBounds(250, 0, 1024, 768);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setShoppingPanel(new ShoppingPanel());
		this.setStartPanel(new StartPanel());
		this.setContentPane(this.getStartPanel());
		
		this.setVisible(true);
	}
	
	
	//Methoden

	public void addActionListenerToStartButton(ActionListener al) {
		this.getStartPanel().addActionListenerToStartButton(al);		
	}
	public void addActionListenerToReturnToStartButton(ActionListener al) {
		this.getShoppingPanel().addActionListenerToStartButton(al);		
	}
	
	public void addActionListenerToProductButton(ActionListener al) {
		this.getOfferpanel().addActionListenerToProductButton(al);		
	}

	public void showShoppingPanel() {
		this.setContentPane(this.getShoppingPanel());
	}
	
	public void showProductPanel() {
		this.setContentPane(this.getProductPanel());
	}
	
	public void showStartPanel() {
		this.setContentPane(this.getStartPanel());
	}

	
	
	
	
	
	//Getter Setter
	public OfferPanel getOfferpanel() {
		return offerpanel;
	}

	public void setOfferpanel(OfferPanel offerpanel) {
		this.offerpanel = offerpanel;
	}

	public ProductPanel getProductPanel() {
		return productPanel;
	}

	public void setProductPanel(ProductPanel productPanel) {
		this.productPanel = productPanel;
	}
	public ShoppingPanel getShoppingPanel() {
		return shoppingPanel;
	}

	public void setShoppingPanel(ShoppingPanel shoppingPanel) {
		this.shoppingPanel = shoppingPanel;
	}

	public StartPanel getStartPanel() {
		return startPanel;
	}

	public void setStartPanel(StartPanel startPanel) {
		this.startPanel = startPanel;
	}
}
