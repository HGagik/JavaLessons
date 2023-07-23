import java.util.*;
public class Bank{
	private final String name;
	private final String bankCode; 
	private final Map<String,Branch> branches;
	

	public Bank(final String name,final String bankCode){
		this.name = name;
		this.bankCode = bankCode;
		this.branches = new HashMap<>();
		
	}

	public String getName(){
		return this.name;
	}
	

	public String getBankCode(){
		return this.bankCode;
	}



	public void addBranches(Branch branch){
		 branches.putIfAbsent(branch.addBranchCode(),branch);

	}

	public Map<String,Branch> getBranches(){
		return this.branches;
	}

}