package bankingApp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateAccount {
	private static JPanel panel;
	private static JFrame frame;
	private static JLabel accNumLabel;
	private static JTextField accText;
	private static JLabel accNameLabel;
	private static JTextField nameText;
	private static JLabel typeLabel;
	private static JTextField typeText;
	private static JLabel balanceLabel;
	private static JTextField balanceText;
	private static JButton subButton;
	private static JLabel subStatus;
	private static JButton backButton;
	private static AccountDetails account;
    private static ArrayList<AccountDetails> accountList;
	private static String accValue;
	private static String nameValue;
	private static String accTypeValue;
	private static String balanceValue;
	
	public static void main(String[] args) {
		DataManagement.CreateArrayList();
		account = new AccountDetails();
		accountList = DataManagement.accounts;
		CreateNewAccount();
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
    	    		 subStatus.setText("Submit Clicked");
    	    		 ValidateInput();
    	    		 SetAccountParameters();
    	    		 AddAccountToList();
    	    	 }
    	     }
    	 };
    	 
    	 backButton.addActionListener(buttonListener);  
    	 subButton.addActionListener(buttonListener);  
	}
	
	public static void CreateNewAccount() {		   
		   //Below sets up the main display
		   panel = new JPanel();
		   frame = new JFrame();
		   frame.setSize(540, 300);
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   frame.add(panel);
		   
		   //Below sets the Layout
	       panel.setLayout(null);		   
		   
	       //Below creates and adds account number label
		   accNumLabel = new JLabel("Account Number");
		   accNumLabel.setBounds(10, 20, 100, 25);
	       panel.add(accNumLabel);	
	       
	       //Below creates and adds account text field
	       accText = new JTextField(200);
	       accText.setBounds(150, 20, 165, 25);
	       panel.add(accText);	
	       
	       //Below creates and adds account holder's name label
	       accNameLabel = new JLabel("Full Name");
	       accNameLabel.setBounds(10, 50, 100, 25);
	       panel.add(accNameLabel);
	       
	       //Below creates and adds account holder's name text field
	       nameText = new JTextField(200);
	       nameText.setBounds(150, 50, 165, 25);
	       panel.add(nameText);	 
	       
	       //Below creates and adds account type label
	       typeLabel = new JLabel("Account Type");
	       typeLabel.setBounds(10, 80, 100, 25);
	       panel.add(typeLabel);
	       
	       //Below creates and adds account type text field
	       typeText = new JTextField(200);
	       typeText.setBounds(150, 80, 165, 25);
	       panel.add(typeText);	  
	       
	       //Below creates and adds current balance label
	       balanceLabel = new JLabel("Balance");
	       balanceLabel.setBounds(10, 110, 100, 25);
	       panel.add(balanceLabel);
	       
	       //Below creates and adds current balance text field
	       balanceText = new JTextField(200);
	       balanceText.setBounds(150, 110, 165, 25);
	       panel.add(balanceText);	
	       
	       //Below creates and adds back button
	       backButton = new JButton("Back");
	       backButton.setBounds(10, 140, 80, 25);
	       panel.add(backButton);
	       
	       //Below creates and adds success label
	       subStatus = new JLabel("");
	       subStatus.setBounds(10, 180, 300, 25);
	       panel.add(subStatus);
	       
	       //Below creates and adds submit button
	       subButton = new JButton("Submit");
	       subButton.setBounds(100, 140, 80, 25);
	       panel.add(subButton); 
	       
	       setUpListeners();
	       frame.setVisible(true);		
	}
	
	public static void ValidateInput() {
		//Below collects all of the text field values
		accValue = accText.getText();
		nameValue = nameText.getText();
		accTypeValue = typeText.getText();
		balanceValue = balanceText.getText();
	}
	
	public static void SetAccountParameters() {
		//Below creates a new account object
		account.accno = accValue;
        account.name = nameValue;
        account.acc_type = accTypeValue;
        account.balance = balanceValue;
	}
	
	public static void AddAccountToList() {
		//Below adds the account to it
		accountList.add(account);
	}
}
