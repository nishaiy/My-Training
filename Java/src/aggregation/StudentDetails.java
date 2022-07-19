package aggregation;

public class StudentDetails {

	public static void main(String[] args) {
		Student s=new Student();
		s.setName("Nisha");
		s.setRollNo(14);
		Address ad = new Address();
		ad.setHouseNo(126);
		ad.setCity("Thrissur");
		ad.setPin(680006);
		ad.setStud(s);
		ad.display();

	}

}
