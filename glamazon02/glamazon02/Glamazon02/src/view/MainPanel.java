package view;

import java.awt.Color;

import javax.swing.JPanel;



public class MainPanel extends JPanel{
	private HeaderPanel headerPanel;
	private CategoryPanel categoryPanel;
	private OfferPanel offerPanel;
	private ProductPanel productPanel;
	private WarenkorbPanel warenkorbPanel;

	
	//Konstruktor
	public MainPanel() {
		
		this.setLayout(null);
		this.setBounds(0, 0, 1024, 768);
		this.setBackground(new Color(240,248,255));;
		
		this.setHeaderPanel(new HeaderPanel());
		this.add(this.getHeaderPanel());
		this.setCategoryPanel(new CategoryPanel());
		this.add(this.getCategoryPanel());
		this.setOfferPanel(new OfferPanel());
		this.add(this.getOfferPanel());
		
		this.setProductPanel(new ProductPanel());
		this.setWarenkorbPanel(new WarenkorbPanel());
	
	
		
	}
	
	
	//Methoden
	

	
	
	//Getter/Setter
	public CategoryPanel getCategoryPanel() {
		return categoryPanel;
	}
	public void setCategoryPanel(CategoryPanel categoryPanel) {
		this.categoryPanel = categoryPanel;
	}
	public OfferPanel getOfferPanel() {
		return offerPanel;
	}
	public void setOfferPanel(OfferPanel offerPanel) {
		this.offerPanel = offerPanel;
	}
	public HeaderPanel getHeaderPanel() {
		return headerPanel;
	}
	public void setHeaderPanel(HeaderPanel headerPanel) {
		this.headerPanel = headerPanel;
	}


	public ProductPanel getProductPanel() {
		return productPanel;
	}

	public void setProductPanel(ProductPanel productPanel) {
		this.productPanel = productPanel;
	}


	public WarenkorbPanel getWarenkorbPanel() {
		return warenkorbPanel;
	}


	public void setWarenkorbPanel(WarenkorbPanel warenkorbPanel) {
		this.warenkorbPanel = warenkorbPanel;
	}


}
