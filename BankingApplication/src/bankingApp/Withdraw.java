package bankingApp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Withdraw {
	    private static JPanel panel;
	    private static JFrame frame;
		private static JLabel amountLabel2;
		private static JTextField amountText2;
		private static JButton witButton;
		private static JButton backButton;
		private static JLabel witStatus;	

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
		       amountLabel2 = new JLabel("Amount To Withdraw");
		       amountLabel2.setBounds(10, 20, 130, 25);
		       panel.add(amountLabel2);	
		       
		       //Below creates and adds amount text field
		       amountText2 = new JTextField(200);
		       amountText2.setBounds(150, 20, 165, 25);
		       panel.add(amountText2);
		       
		       //Below creates and adds back button
		       backButton = new JButton("Back");
		       backButton.setBounds(10, 50, 110, 25);
		       panel.add(backButton);
		       
		       //Below creates and adds withdraw button
		       witButton = new JButton("Withdraw");
		       witButton.setBounds(130, 50, 110, 25);
		       panel.add(witButton);		       
		       
		       //Below creates and adds success label
		       witStatus = new JLabel("");
		       witStatus.setBounds(10, 80, 300, 25);
		       panel.add(witStatus);
		       
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
	    	    		 witStatus.setText("Withdraw Clicked");
	    	    	 }
	    	     }
	    	 };
	    	 
	    	 backButton.addActionListener(buttonListener);  
	    	 witButton.addActionListener(buttonListener);   
		}
}
