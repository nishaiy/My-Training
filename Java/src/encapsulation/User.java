package encapsulation;

import java.util.Scanner;

	public class User extends Bank{

		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Bank b= new Bank();
		System.out.println("Enter the pin number: ");
		int n = input.nextInt();
		
		b.setPinNumber(n);
		b.validate(n);
		input.close();
		}

	}


