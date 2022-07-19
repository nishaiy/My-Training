package abstract_assign;

import java.util.Scanner;

public class Contractor extends Employee {
	public static float hr;
	public void calculateSalary()
	{
		double salary = PAYMENT * hr;
		System.out.println("Salary of the employee: "+salary);
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Contractor c = new Contractor();
		System.out.print("Enter the working hour: ");
		hr = input.nextFloat();
		c.calculateSalary();
		input.close();
		
	}
}

