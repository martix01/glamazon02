package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProductPanel extends JPanel{

	private JLabel productHeadlineLabel;
	
	
	public ProductPanel() {
		Font f = new Font("Arial", Font.BOLD, 20);
		
		
		this.setLayout(null);
		this.setBounds(204, 200, 820, 568);
		this.setBackground(new Color(245,245,220));
		
		this.setProductHeadlineLabel(new JLabel("<html><u>Produkt im Detail</u></<html>"));
		this.getProductHeadlineLabel().setBounds(330, 11, 167, 48);
		this.productHeadlineLabel.setFont(f);
		this.add(productHeadlineLabel);
		
	}

	
	
	
	

	public JLabel getProductHeadlineLabel() {
		return productHeadlineLabel;
	}


	public void setProductHeadlineLabel(JLabel productHeadlineLabel) {
		this.productHeadlineLabel = productHeadlineLabel;
	}
	
	
	
	
}


