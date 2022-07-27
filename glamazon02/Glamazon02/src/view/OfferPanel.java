package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.JTextField;

public class OfferPanel extends JPanel{
	



	private JLabel offerHeadlineLabel;
	private JButton btnProductDetail;

	
	//Konstruktor
	public OfferPanel() {
		
		this.setLayout(null);
		Font f = new Font("Arial", Font.BOLD, 20);
		this.setBounds(204, 200, 820, 568);
		this.setBackground(new Color(155,196,226));;
		
	
		this.setBtnProductDetail(new JButton("Produktansicht"));
		this.getBtnProductDetail().setBounds(72, 307, 143, 34);
		
		this.setOfferHeadlineLabel(new JLabel ("<html><u>Angebote</u></<html>"));
		this.offerHeadlineLabel.setFont(f);
		this.getOfferHeadlineLabel().setBounds(301, 11 , 150,20);
		
	
		this.add(offerHeadlineLabel);
		this.add(this.getBtnProductDetail());

	
	}
	
	
	//Methoden
	public void addActionListenerToProductButton(ActionListener al) {
		this.getBtnProductDetail().addActionListener(al);		
	}
	
	

	//Getter Setter
	public JLabel getOfferHeadlineLabel() {
		return offerHeadlineLabel;
	}


	public void setOfferHeadlineLabel(JLabel offerHeadlineLabel) {
		
		this.offerHeadlineLabel = offerHeadlineLabel;
		
	}


	public JButton getBtnProductDetail() {
		return btnProductDetail;
	}


	public void setBtnProductDetail(JButton btnProductDetail) {
		this.btnProductDetail = btnProductDetail;
	}
}
