import java.util.*;


public class Main{
	
	public static void main(String[] args){
		final String acbaBankName = "Acba";
		final String acbaBankCode = "220";
	
	final Bank acba = new Bank(acbaBankName, acbaBankCode);
	

	final Branch branchArarat = new Branch("Ararat");
	acba.addBranches(branchArarat);
	String branchAraratCode = branchArarat.getBranchCode(); 

    final Branch branchYerevan = new Branch("Yerevan");
    acba.addBranches(branchYerevan);
	String branchYerevanCode = branchYerevan.getBranchCode();

	final Branch branchAbovyan = new Branch("Abovyan");
	acba.addBranches(branchAbovyan);
	String branchAbovyanCode = branchAbovyan.getBranchCode();
	
	

	final String branchAraratAccountNumber1 = acba.getBankCode() + branchAraratCode + Account.addInitialAccountNumber();
	final String branchAraratAccountNumber2 = acba.getBankCode() + branchAraratCode + Account.addInitialAccountNumber();

	final String branchYerevanAccountNumber1 = acba.getBankCode() + branchYerevanCode + Account.addInitialAccountNumber();
	final String branchYerevanAccountNumber2 = acba.getBankCode() + branchYerevanCode + Account.addInitialAccountNumber();

	final String branchAbovyanAccountNumber1 = acba.getBankCode() + branchAbovyanCode + Account.addInitialAccountNumber();
	final String branchAbovyanAccountNumber2 = acba.getBankCode() + branchAbovyanCode + Account.addInitialAccountNumber();


	final String clientCode1 = acba.getBankCode() + branchAraratCode + Client.addInitialClientCode();

	final String clientCode2 = acba.getBankCode() + branchYerevanCode + Client.addInitialClientCode();

	final String clientCode3 = acba.getBankCode() + branchAbovyanCode + Client.addInitialClientCode();



    final Client tatev = new Client(clientCode1);
    branchArarat.addClient(tatev);
	final Account firstAccountOfTatev = new Account(branchAraratAccountNumber1,"AMD",100000);
	final Account secondAccountOfTatev = new Account(branchAraratAccountNumber2,"USD",100);
	tatev.addAccount(firstAccountOfTatev);
	tatev.addAccount(secondAccountOfTatev);

    
    final Client anahit = new Client(clientCode2);
    branchYerevan.addClient(anahit);
	final Account firstAccountOfAnahit = new Account(branchYerevanAccountNumber1,"AMD",200000);
	anahit.addAccount(firstAccountOfAnahit);

    
    final Client irina = new Client(clientCode3);
    branchAbovyan.addClient(irina);
    final Account firstAccountOfIrina = new Account(branchAbovyanAccountNumber1,"AMD",1000000);
	irina.addAccount(firstAccountOfIrina);

	


System.out.println(acba.getBranches().get(branchYerevanCode).getClients().get(clientCode2).getAccounts().get(branchYerevanAccountNumber1).getAccountBalance());

	}


}