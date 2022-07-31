package view;

import java.awt.Button;
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
	private JButton btnReturnToStart;
	private String kategorien[] = {"Buecher", "Elektronik", "Mode", 
	            "Film- und Fernsehen", "Musik", "Drogerie"};
	 JButton[] buttons = new JButton[kategorien.length];

	
	public CategoryPanel() {
		Font f = new Font("Arial", Font.BOLD, 20);
		this.setBounds(0, 200, 204, 568);
		//this.setLayout(null);
	
		this.setBackground(Color.LIGHT_GRAY);
		this.setCategoryHeadlineLabel(new JLabel("<html><u>Kategorien</u></<html>"));
		this.categoryHeadlineLabel.setFont(f);
		categoryHeadlineLabel.setBounds(50, 30, 103, 24);
		this.setBtnReturnToStart(new JButton("Startseite"));
		this.getBtnReturnToStart().setBounds(0, 250, 143, 34);
		
		
		
		//Hinzufügen
		this.add(this.getCategoryHeadlineLabel());
		this.add(this.getBtnReturnToStart());
		for (int i = 0; i < kategorien.length; i++) {
			
			buttons[i] = new JButton(kategorien[i]);
			this.add(this.buttons[i]);
		}
	
			
	
	}
	
	//Methoden
	public void addActionListenerToReturnButton(ActionListener al) {
		this.getBtnReturnToStart().addActionListener(al);
	}





	public JLabel getCategoryHeadlineLabel() {
		return categoryHeadlineLabel;
	}




	public void setCategoryHeadlineLabel(JLabel categoriesLabel) {
		this.categoryHeadlineLabel = categoriesLabel;
		
	}







	public JButton getBtnReturnToStart() {
		return btnReturnToStart;
	}







	public void setBtnReturnToStart(JButton btnReturnToStart) {
		this.btnReturnToStart = btnReturnToStart;
	}






	
}


