package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class WarenkorbPanel extends JPanel{

	private JLabel warenkorbHeadlineLabel;
	
	
	
	public WarenkorbPanel() {
		
	
	Font f = new Font("Arial", Font.BOLD, 20);
		
		
		this.setLayout(null);
		this.setBounds(204, 200, 820, 568);
		this.setBackground(Color.GREEN);
		
		
		this.setWarenkorbHeadlineLabel(new JLabel("<html><u>Warenkorb</u></<html>"));
		this.getWarenkorbHeadlineLabel().setBounds(330, 11, 167, 48);
		this.warenkorbHeadlineLabel.setFont(f);
		this.add(warenkorbHeadlineLabel);
	}



	public JLabel getWarenkorbHeadlineLabel() {
		return warenkorbHeadlineLabel;
	}



	public void setWarenkorbHeadlineLabel(JLabel warenkorbHeadlineLabel) {
		this.warenkorbHeadlineLabel = warenkorbHeadlineLabel;
	}
	
	
	
}
