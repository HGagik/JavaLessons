public class Main {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee();
        employee1.setSalary(1500000.0);
        employee1.setYearsOfExperience(1);

        Employee employee2 = new Employee();
        employee2.setSalary(1600000.0);
        employee2.setYearsOfExperience(2);

        Employee employee3 = new Employee();
        employee3.setSalary(800000.0);
        employee3.setYearsOfExperience(0);

        
        Company company = new Company();
        company.setMoneyInBank(10000000.0);
        company.setEmployees(new Employee[]{employee1, employee2,employee3});

        
        if (company.canAffordEmployees()){
        	System.out.println("Company can afford these employees");
        }
        	else{
        		System.out.println("Company cann't afford these employees");
        	}
        
    }
}