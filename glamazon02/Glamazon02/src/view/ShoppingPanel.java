package view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JList;

public class ShoppingPanel extends JPanel {
	private JButton btnReturn;
	private HeaderPanel headerPanel;
	private CategoryPanel categoriesPanel;
	private OfferPanel offerPanel;
	

	public JButton getBtnReturn() {
		return btnReturn;
	}

	public void setBtnReturn(JButton btnReturn) {
		this.btnReturn = btnReturn;
		btnReturn.setBounds(31, 452, 150, 35);
		categoriesPanel.add(btnReturn);
	}

	public HeaderPanel getHeaderPanel() {
		return headerPanel;
	}

	public void setHeaderPanel(HeaderPanel headerPanel) {
		this.headerPanel = headerPanel;
	}
	
	public OfferPanel getAngebotePanel() {
		return offerPanel;
	}

	public void setAngebotePanel(OfferPanel angebotePanel) {
		this.offerPanel = angebotePanel;
	}


	public ShoppingPanel() {
		this.setLayout(null);
		this.setBounds(0, 0, 1024, 768);
	
		this.setBackground(new Color(240,248,255));
		
		this.setHeaderPanel(new HeaderPanel());
		this.add(this.getHeaderPanel());
		this.setCategoriesPanel(new CategoryPanel());
		this.add(this.getCategoriesPanel());
		
		this.setBtnReturn(new JButton("Zurueck zum Start"));
		this.setAngebotePanel(new OfferPanel());
		this.add(this.getAngebotePanel());
		
		
		
		
		
		
		
		
	}

	public void addActionListenerToStartButton(ActionListener al) {
		this.getBtnReturn().addActionListener(al);
	}

	public CategoryPanel getCategoriesPanel() {
		return categoriesPanel;
	}

	public void setCategoriesPanel(CategoryPanel categoriesPanel) {
		this.categoriesPanel = categoriesPanel;
	}

}
