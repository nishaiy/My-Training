package interfaceAssignment;
import java.util.Scanner;

public class HDFC implements RBI{
	
	public double recurringDeposit(float p, float t) {
		double cal = p * INTEREST * t;
		double m = p + cal;
		return m;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		float p = input.nextFloat();
		System.out.println("Enter the duration(yearly): ");
		float t = input.nextFloat();
		HDFC bank = new HDFC();
		double r = bank.recurringDeposit(p, t);
		System.out.println("Maturity amount: "+r);
		input.close();
	}
}
