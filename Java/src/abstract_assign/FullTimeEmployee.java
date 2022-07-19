package abstract_assign;
public class FullTimeEmployee extends Employee{
	final int CONST = 8;
	public void calculateSalary()
	{
		double salary = PAYMENT * CONST;
		System.out.println("Salary of the employee: "+salary);
	}
	
	public static void main(String[] args)
	{
		FullTimeEmployee full = new FullTimeEmployee();
		full.calculateSalary();
		
	}

}
