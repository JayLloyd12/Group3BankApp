package bankingApp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Found {
	 private static JPanel panel;
	 private static JFrame frame;	
     private static JLabel accNumLabel3;
     private static JLabel accNumLabel4;
     private static JLabel accNameLabel3;
     private static JLabel accNameLabel4;
     private static JLabel typeLabel3;
     private static JLabel typeLabel4;  
     private static JLabel balLabel3;
     private static JLabel balLabel4; 
 	 private static JButton depButton2;
 	 private static JButton witButton2;
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
		   accNumLabel3 = new JLabel("Account Number:");
		   accNumLabel3.setBounds(10, 20, 180, 25);
	       panel.add(accNumLabel3);	
	       
	       //Below creates and adds account number label
	       accNumLabel4 = new JLabel("Test");
	       accNumLabel4.setBounds(120, 20, 180, 25);
	       panel.add(accNumLabel4);	
	       
	       //Below creates and adds name label
	       accNameLabel3 = new JLabel("Name:");
	       accNameLabel3.setBounds(10, 50, 180, 25);
	       panel.add(accNameLabel3);	
	       
	       //Below creates and adds name text label
	       accNameLabel4 = new JLabel("Test");
	       accNameLabel4.setBounds(120, 50, 180, 25);
	       panel.add(accNameLabel4);	
	       
	       //Below creates and adds type label
	       typeLabel3 = new JLabel("Account Type:");
	       typeLabel3.setBounds(10, 80, 180, 25);
	       panel.add(typeLabel3);	
	       
	       //Below creates and adds account type label
	       typeLabel4 = new JLabel("Test");
	       typeLabel4.setBounds(120, 80, 180, 25);
	       panel.add(typeLabel4);
	       
	       //Below creates and adds balance label
	       balLabel3 = new JLabel("Balance:");
	       balLabel3.setBounds(10, 110, 180, 25);
	       panel.add(balLabel3);	
	       
	       //Below creates and adds balance amount label
	       balLabel4 = new JLabel("Test");
	       balLabel4.setBounds(120, 110, 180, 25);
	       panel.add(balLabel4);	
	       
	       //Below creates and adds deposit button
	       depButton2 = new JButton("Deposit");
	       depButton2.setBounds(10, 140, 110, 25);
	       panel.add(depButton2);
	       
	       //Below creates and adds withdraw button
	       witButton2 = new JButton("Withdraw");
	       witButton2.setBounds(140, 140, 110, 25);
	       panel.add(witButton2);
	       
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
    	    	 
    	    	 if(o == depButton2) {
    	    		 buttonStatus.setText("Deposit Clicked");
    	    	 } else {
    	    		 buttonStatus.setText("Withdraw Clicked");
    	    	 }
    	     }
    	 };
    	 
    	 depButton2.addActionListener(buttonListener);  
    	 witButton2.addActionListener(buttonListener);  	
	}
}
