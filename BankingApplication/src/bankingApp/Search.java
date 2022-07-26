package bankingApp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Search {
	 private static JPanel panel;
	 private static JFrame frame;
     private static JLabel accNumLabel2;
     private static JTextField accText2;
 	 private static JButton goButton1; 
     private static JLabel orLabel;
     private static JLabel accNameLabel2; 
     private static JTextField nameText2;
 	 private static JButton goButton2;
 	 private static JButton backButton;
 	 private static JLabel buttonStatus;

	public static void main(String[] args) {
		   //Below sets up the main display
		   panel = new JPanel();
		   frame = new JFrame();
		   frame.setSize(540, 300);
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   frame.add(panel);
		   
		   //Below sets the Layout
	       panel.setLayout(null);
	       
	       //Below creates and adds account label
	       accNumLabel2 = new JLabel("Search By Account Number");
	       accNumLabel2.setBounds(10, 20, 180, 25);
	       panel.add(accNumLabel2);	
	       
	       //Below creates and adds account text field
	       accText2 = new JTextField(200);
	       accText2.setBounds(190, 20, 165, 25);
	       panel.add(accText2);	
	       
	       //Below creates and adds go button
	       goButton1 = new JButton("Go");
	       goButton1.setBounds(370, 20, 80, 25);
	       panel.add(goButton1);
	       
	       //Below creates and adds or label
	       orLabel = new JLabel("OR");
	       orLabel.setBounds(250, 50, 80, 25);
	       panel.add(orLabel);	
	       
	       //Below creates and adds  name label
	       accNameLabel2 = new JLabel("Search By Name");
	       accNameLabel2.setBounds(10, 80, 180, 25);
	       panel.add(accNameLabel2);
	       
	       //Below creates and adds name text field
	       nameText2 = new JTextField(200);
	       nameText2.setBounds(190, 80, 165, 25);
	       panel.add(nameText2);	
	       
	       //Below creates and adds go button
	       goButton2 = new JButton("Go");
	       goButton2.setBounds(370, 80, 80, 25);
	       panel.add(goButton2);
	       
	       //Below creates and adds back button
	       backButton = new JButton("Back");
	       backButton.setBounds(10, 140, 80, 25);
	       panel.add(backButton);
	       
	       //Below creates and adds success label
	       buttonStatus = new JLabel("");
	       buttonStatus.setBounds(10, 200, 300, 25);
	       panel.add(buttonStatus);	       
	       
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
    	    	 } 
    	    	 
    	    	 if(o == goButton1){
    	    		 buttonStatus.setText("Go Button 1 Clicked"); 
    	    	 } else {
    	    		 buttonStatus.setText("Go Button 2 Clicked");
    	    	 }
    	     }
    	 };
    	 
    	 backButton.addActionListener(buttonListener);  
    	 goButton1.addActionListener(buttonListener);
    	 goButton2.addActionListener(buttonListener);
	}	

}
