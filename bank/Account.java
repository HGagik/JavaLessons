public class Account{
	private final  String accountCurrency;
	private final  double accountBalance;
	private static int initialAccountNumber = 1000000;
	private String accountNumber;

	public Account(final String accountNumber,final String accountCurrency,final double accountBalance){
		this.accountNumber  = accountNumber;
		this.accountCurrency = accountCurrency;
		this.accountBalance = accountBalance;		
	} 

	public static String addInitialAccountNumber(){
		 initialAccountNumber++;
		 return "" + initialAccountNumber;
	}

	public String getAccountCurrency(){
		return this.accountCurrency;
	}

	public double getAccountBalance(){
		return this.accountBalance;
	}

	public String getAccountNumber(){
		return this.accountNumber;
	}

}