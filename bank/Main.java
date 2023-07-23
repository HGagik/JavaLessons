import java.util.*;


public class Main{
	
	public static void main(String[] args){
		final String acbaBankName = "Acba";
		final String acbaBankCode = "220";
	
	Bank acba = new Bank(acbaBankName, acbaBankCode);
	

	Branch branchArarat = new Branch("Ararat");
	acba.addBranches(branchArarat);
	String branchAraratCode = branchArarat.getBranchCode(); 

    Branch branchYerevan = new Branch("Yerevan");
    acba.addBranches(branchYerevan);
	String branchYerevanCode = branchYerevan.getBranchCode();

	Branch branchAbovyan = new Branch("Abovyan");
	acba.addBranches(branchAbovyan);
	String branchAbovyanCode = branchAbovyan.getBranchCode();



	
	
	

	String branchAraratAccountNumber1 = acba.getBankCode() + branchAraratCode + Account.addInitialAccountNumber();
	String branchAraratAccountNumber2 = acba.getBankCode() + branchAraratCode + Account.addInitialAccountNumber();

	String branchYerevanAccountNumber1 = acba.getBankCode() + branchYerevanCode + Account.addInitialAccountNumber();
	String branchYerevanAccountNumber2 = acba.getBankCode() + branchYerevanCode + Account.addInitialAccountNumber();

	String branchAbovyanAccountNumber1 = acba.getBankCode() + branchAbovyanCode + Account.addInitialAccountNumber();
	String branchAbovyanAccountNumber2 = acba.getBankCode() + branchAbovyanCode + Account.addInitialAccountNumber();


	String clientCode1 = acba.getBankCode() + branchAraratCode + Client.addInitialClientCode();

	String clientCode2 = acba.getBankCode() + branchYerevanCode + Client.addInitialClientCode();

	String clientCode3 = acba.getBankCode() + branchAbovyanCode + Client.addInitialClientCode();



    Client tatev = new Client(clientCode1);
    branchArarat.addClient(tatev);
	Account firstAccountOfTatev = new Account(branchAraratAccountNumber1,"AMD",100000);
	Account secondAccountOfTatev = new Account(branchAraratAccountNumber2,"USD",100);
	tatev.addAccount(firstAccountOfTatev);
	tatev.addAccount(secondAccountOfTatev);

    
    Client anahit = new Client(clientCode2);
    branchYerevan.addClient(anahit);
	Account firstAccountOfAnahit = new Account(branchYerevanAccountNumber1,"AMD",200000);
	anahit.addAccount(firstAccountOfAnahit);

    
    Client irina = new Client(clientCode3);
    branchAbovyan.addClient(irina);
    Account firstAccountOfIrina = new Account(branchAbovyanAccountNumber1,"AMD",1000000);
	irina.addAccount(firstAccountOfIrina);

	


System.out.println(acba.getBranches().get(branchYerevanCode).getClients().get(clientCode2).getAccounts().get(branchYerevanAccountNumber1).getAccountBalance());

	}


}