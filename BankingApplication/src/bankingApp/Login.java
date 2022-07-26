package bankingApp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener {
	 private static JLabel userLabel;
	 private static JTextField userText;
	 private static JLabel passwordLabel;
	 private static JPasswordField passwordText;
	 private static JButton button;
	 private static JLabel success;

	 public static void main(String[] args) {
	   //Below sets up the main display
	   JPanel panel = new JPanel();
	   JFrame frame = new JFrame();
	   frame.setSize(540, 300);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.add(panel);
	   
	   //Below sets the Layout
       panel.setLayout(null);
             
       //Below creates and adds the user name label
       userLabel = new JLabel("User Name");
       userLabel.setBounds(10, 20, 80, 25);
       panel.add(userLabel);
       
       //Below creates and adds text field
       userText = new JTextField(200);
       userText.setBounds(100, 20, 165, 25);
       panel.add(userText);
       
       //Below creates and adds password label
       passwordLabel = new JLabel("Password");
       passwordLabel.setBounds(10, 50, 80, 25);
       panel.add(passwordLabel);
       
       //Below creates and adds password field
       passwordText = new JPasswordField();
       passwordText.setBounds(100, 50, 165, 25);
       panel.add(passwordText);
       
       //Below creates and adds a button
       button = new JButton("Login");
       button.setBounds(10, 80, 80, 25);
       button.addActionListener(new Login());
       panel.add(button);
       
       //Below creates and adds success label
       success = new JLabel("");
       success.setBounds(10, 110, 300, 25);
       panel.add(success);
       
       frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    String user = userText.getText();
	    char[] password = passwordText.getPassword();
	    char [] correctPass = new char [] {'1', '2', '3'};
	    
	    if (user.equals("admin") && Arrays.equals(password, correctPass)) {
	    	success.setText("Login Successful");
	    } else {
	    	success.setText("Login Failed");
	    }
	}

}