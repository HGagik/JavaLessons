import java.util.*;
public class Client{
	
	final private Map<String,Account> accounts;
	private static int initialClientCode = 1000;
	private String clientCode;

	public Client(final String clientCode){
		this.clientCode = clientCode;
		this.accounts = new HashMap<>();
	}


	public static String addInitialClientCode(){
		initialClientCode++;
		return "" + initialClientCode;
	}

	public Map<String,Account> getAccounts(){
		return this.accounts;
	}

	public static String getInitialClientCode(){
		return "" + initialClientCode;
	}

	public String getClientCode(){
		return this.clientCode;
	}

	public void addAccount(Account account){
		 accounts.putIfAbsent(account.getAccountNumber(),account);
	}
}
