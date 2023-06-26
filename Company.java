public class Company {
    private String name;
    private double moneyInBank;
    private Employee[] employees;

    public void setName(String name) {
        this.name = name;
    }

    public void setMoneyInBank(double moneyInBank) {
        this.moneyInBank = moneyInBank;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public boolean canAffordEmployees() {
        double totalSalary = 0.0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary <= moneyInBank;
    }
}