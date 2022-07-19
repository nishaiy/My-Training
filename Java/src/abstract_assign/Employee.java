package abstract_assign;

import java.util.Scanner;

public abstract class Employee {
	final double PAYMENT = 100;
	
	public abstract void calculateSalary();
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String s = input.nextLine();
		
		input.close();
		
	}

}
