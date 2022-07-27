package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class CategoryPanel extends JPanel{

	private JLabel categoryHeadlineLabel;
	private String kategorien[] = {"Buecher", "Elektronik", "Mode", 
	            "Film- und Fernsehen", "Musik", "Drogerie"};
	

	
	public CategoryPanel() {
		Font f = new Font("Arial", Font.BOLD, 20);
		this.setBounds(0, 200, 204, 568);
		
		this.setBackground(Color.LIGHT_GRAY);
		this.setCategoryHeadlineLabel(new JLabel("<html><u>Kategorien</u></<html>"));
		this.categoryHeadlineLabel.setFont(f);
		
	 
		 
		JList kategorieAuswahl = new JList(kategorien);
		kategorieAuswahl.setBounds(50, 92, 103, 111);
		setLayout(null);
		 
		
				
		
		//Hinzufügen
		this.add(this.getCategoryHeadlineLabel());
		this.add(kategorieAuswahl);
	
				
	
	}
	
	

	public JLabel getCategoryHeadlineLabel() {
		return categoryHeadlineLabel;
	}




	public void setCategoryHeadlineLabel(JLabel categoriesLabel) {
		this.categoryHeadlineLabel = categoriesLabel;
		categoryHeadlineLabel.setBounds(50, 30, 103, 24);
	}




	
}


