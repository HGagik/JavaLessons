import java.util.*;
public class Branch{
	 private static int initialBranchCode = 0;
	 private final String name;
	 private final Map<String,Client> clients;


	 public Branch(final String name){
	 	this.name = name;
	 	this.clients = new HashMap<String,Client>();
	 	
	 }

	  public void addClient(final Client client){
	  
          clients.putIfAbsent(client.getClientCode(),client);  
	 	} 

	 public static String addBranchCode(){
	 	initialBranchCode++;
	 	return "0" + initialBranchCode;
	 }

	 public String getBranchCode(){
	 	return "0" + this.initialBranchCode;
	 }

	 public String getName(){
	 	return this.name;
	 }

	 public Map<String,Client> getClients(){
	 	return this.clients;
	 }



}