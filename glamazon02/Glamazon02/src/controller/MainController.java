package controller;

import java.awt.event.ActionEvent;


import view.MainView;

public class MainController {
	private MainView mainView;


	//Konstruktor	
	public MainController() {
		this.setMainView(new MainView());	
		this.getMainView().addActionListenerToStartButton(this::startShopping);
		this.getMainView().addActionListenerToReturnToStartButton(this::returnToStart);
		this.getMainView().getMainPanel().getOfferPanel().addActionListenerToProductButton(this::showProductPanel);
	}
	
	
	//Methoden
	public void startShopping(ActionEvent e) {
		this.getMainView().showShoppingPanel();
	}
	
	
	public void showProductPanel(ActionEvent e) {
		this.getMainView().getMainPanel().removeAll();
		this.getMainView().revalidate();
	
		
		this.getMainView().getMainPanel().getCategoryPanel();
		this.getMainView().getMainPanel().getProductPanel();
		
		
		System.out.println("klick");
	}
	
	
	public void returnToStart(ActionEvent e) {
		this.getMainView().showStartPanel();
	}
	
	
	//Getter Setter
	public MainView getMainView() {
		return mainView;
	}

	public void setMainView(MainView mainView) {
		this.mainView = mainView;
	}
}
