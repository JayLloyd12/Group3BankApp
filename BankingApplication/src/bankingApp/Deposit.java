package bankingApp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Deposit {
	private static JPanel panel;
	private static JFrame frame;
	private static JLabel amountLabel1;
	private static JTextField amountText1;
	private static JButton depButton;
	private static JButton backButton;
	private static JLabel depStatus;	

	public static void main(String[] args) {
		   //Below sets up the main display
		   panel = new JPanel();
		   frame = new JFrame();
		   frame.setSize(540, 300);
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   frame.add(panel);
		   
		   //Below sets the Layout
	       panel.setLayout(null);
	       
	       //Below creates and adds amount label
	       amountLabel1 = new JLabel("Amount To Deposit");
	       amountLabel1.setBounds(10, 20, 130, 25);
	       panel.add(amountLabel1);	
	       
	       //Below creates and adds amount text field
	       amountText1 = new JTextField(200);
	       amountText1.setBounds(150, 20, 165, 25);
	       panel.add(amountText1);
	       
	       //Below creates and adds back button
	       backButton = new JButton("Back");
	       backButton.setBounds(10, 50, 80, 25);
	       panel.add(backButton);
	       
	       //Below creates and adds deposit button
	       depButton = new JButton("Deposit");
	       depButton.setBounds(100, 50, 80, 25);
	       panel.add(depButton);	       
	       
	       //Below creates and adds success label
	       depStatus = new JLabel("");
	       depStatus.setBounds(10, 80, 300, 25);
	       panel.add(depStatus);
	       
	       setUpListeners();
	       frame.setVisible(true);	       

	}
	
	//Below sets up clicked events
	private static void setUpListeners() {
		 ActionListener buttonListener = new ActionListener() {
    	     @Override
    	     public void actionPerformed(ActionEvent clicked) {
    	    	 Object o = clicked.getSource();
    	    	 
    	    	 if(o == backButton) {
    	    		 MainMenu.setUpMain();
    	    		 frame.dispose();
    	    	 } else {
    	    		 depStatus.setText("Deposit Clicked");
    	    	 }
    	     }
    	 };
    	 
    	 backButton.addActionListener(buttonListener);  
    	 depButton.addActionListener(buttonListener);   
	}

}
