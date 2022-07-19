package interface_example;

public class InterfaceClass implements SampleInter3{
	public void display()
	{
		System.out.println("Hi! In SampleInter1");
	}
	
	public void detail()
	{
		System.out.println("Hi! In SampleInter2");
		System.out.println(AB);
	}

	public void Inter()
	{
		System.out.println("Hi! In Inter");
	}
	
	
	public static void main(String[] args) {
		InterfaceClass i = new InterfaceClass();
		i.display();
		i.detail();
		i.Inter();
	}

}
