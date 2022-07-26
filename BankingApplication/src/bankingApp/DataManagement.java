package bankingApp;
import java.util.ArrayList;

public class DataManagement {
	public static ArrayList<AccountDetails>  accounts;
	
	public static void CreateArrayList () {
		//Below creates an array of accounts
		accounts = new ArrayList<AccountDetails>();
	}
}
