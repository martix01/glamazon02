package view;

import javax.swing.JPanel;



public class MainPanel extends JPanel{
	private HeaderPanel headerPanel;
	private CategoryPanel categoryPanel;
	private OfferPanel offerPanel;
	private ProductPanel productPanel;
	
	//Konstruktor
	public MainPanel() {
		
		this.setLayout(null);
		this.setBounds(0, 0, 1024, 768);
		
		this.setHeaderPanel(new HeaderPanel());
		this.add(this.getHeaderPanel());
		this.setCategoryPanel(new CategoryPanel());
		this.add(this.getCategoryPanel());
		this.setOfferPanel(new OfferPanel());
		this.add(this.getOfferPanel());
		
		
		this.setProductPanel(new ProductPanel());
		this.add(this.getProductPanel());
		
	}
	
	
	
	
	
	
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
	
	
}
