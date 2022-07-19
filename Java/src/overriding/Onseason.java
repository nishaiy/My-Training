package overriding;
public class Onseason extends Offseason{
	public void discount(double price)
	{
		double amount;
		amount = 0.4*price;
		System.out.println("Total amount: "+amount);
	}
	public static void main(String[] args)
	{
	
	}
}
