package exceptionExample;
import java.io.IOException;
public class ExceptionEx {
	
	public void calculation(int a, int b) throws Exception
	{
		int arr[]= new int[5];
		try {
		
			float result= a/b;
			System.out.println("Result: "+result);
			if(result>=2)
			{
				throw new IOException("Created new exception");
			}
			for(int i=0; i<= arr.length; i++)
			{
				arr[i]=i+1;
				System.out.println(arr[i]);
			}
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero not possible");
		}
		
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Array length is 5");
		}
		/*catch(Exception ee) 
		{
			System.out.println("Exception in parent class");
		}*/
		
		finally
		{
			System.out.println("Finally block");
		}
		System.out.println("Hello");
	}
	
	public static void main(String[] args) throws Exception 
	{
		ExceptionEx excep = new ExceptionEx();
		excep.calculation(10, 2);
	}
}
