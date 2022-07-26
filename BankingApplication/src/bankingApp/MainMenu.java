package bankingApp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu {
	 private static JPanel panel;
	 private static JFrame frame;
	 private static JButton createButton;
	 private static JButton findButton;
	 private static JLabel action;

	public static void main(String[] args) {
		setUpMain();	       
	}
    
	//Below sets up clicked events
	private static void setUpListeners() {
		 ActionListener buttonListener = new ActionListener() {
    	     @Override
    	     public void actionPerformed(ActionEvent clicked) {
    	    	 Object o = clicked.getSource();
    	    	 
    	    	 if(o == createButton) {
    	    		 CreateAccount.CreateNewAccount();
    	    		 frame.dispose();
    	    	 } else {
    	    		 action.setText("Find Clicked");
    	    	 }
    	     }
    	 };
    	 
    	 createButton.addActionListener(buttonListener);  
    	 findButton.addActionListener(buttonListener);   
	}
    
	public static void setUpMain() {
		   //Below sets up the main display
		   panel = new JPanel();
		   frame = new JFrame();
		   frame.setSize(540, 300);
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   frame.add(panel);
		   
		   //Below sets the Layout
	       panel.setLayout(null);
	       
	       //Below creates and adds create button
	       createButton = new JButton("Create New Account");
	       createButton.setBounds(50, 80, 180, 25);
	       panel.add(createButton);
	       
	       //Below creates and adds find button
	       findButton = new JButton("Find Existing Account");
	       findButton.setBounds(250, 80, 180, 25);
	       panel.add(findButton);
	       
	       //Below creates and adds success label
	       action = new JLabel("");
	       action.setBounds(10, 110, 300, 25);
	       panel.add(action);	       
	       
	       setUpListeners();
	       frame.setVisible(true);		
	}
}
