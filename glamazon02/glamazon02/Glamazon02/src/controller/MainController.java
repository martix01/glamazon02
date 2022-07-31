package controller;

import java.awt.event.ActionEvent;


import view.MainView;

public class MainController {
	private MainView mainView;


	//Konstruktor	
	public MainController() {
		this.setMainView(new MainView());	
		this.getMainView().addActionListenerToStartButton(this::startShopping);
		this.getMainView().getMainPanel().getHeaderPanel().addActionListenertoWarenkorbButton(this::showWarenkorb);
		this.getMainView().getMainPanel().getOfferPanel().addActionListenerToProductButton(this::showProductPanel);
		this.getMainView().getMainPanel().getCategoryPanel().addActionListenerToReturnButton(this::returnToStart);
	}
	
	
	//Methoden
	public void startShopping(ActionEvent e) {
		this.getMainView().showShoppingPanel();
		
	}
	
	public void showWarenkorb(ActionEvent e) {
		this.getMainView().showWarenkorbPanel();
	}
	
	
	public void showProductPanel(ActionEvent e) {
		
		this.getMainView().showProductPanel();
		
	}
	
	
	public void returnToStart(ActionEvent e) {
		this.getMainView().showMainPanel();
	}
	
	
	//Getter Setter
	public MainView getMainView() {
		return mainView;
	}

	public void setMainView(MainView mainView) {
		this.mainView = mainView;
	}
}
