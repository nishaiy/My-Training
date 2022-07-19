package overriding;
import java.util.Calendar;
import java.util.Scanner;

public class Offseason {
	public void discount(double price)
	{
		double amount;
		amount = 0.15*price;
		System.out.println("Total amount: "+amount);
	}
	
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		Scanner input = new Scanner(System.in);
		Onseason on = new Onseason();
		Offseason of = new Offseason();
		System.out.println("Enter the price: ");
		double price = input.nextDouble();
		switch(cal.get(Calendar.MONTH) + 1)
		{
		case 1, 2, 3, 4, 5 : 			of.discount(price);
										break;
							
		case 6, 7, 8, 9, 10, 11, 12 :	on.discount(price);
										break;
		}
		input.close();
	}

}
