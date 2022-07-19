package aggregation;

public class Address {
	private int houseNo;
	private String city;
	private int pin;
	private Student stud;
	
	
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public Student getStud() {
		return stud;
	}
	public void setStud(Student stud) {
		this.stud = stud;
	}
	
	
	public void display()
	{
		System.out.println("Student Roll No: "+stud.getRollNo());
		System.out.println("Student name: "+stud.getName());
		System.out.println("House No: "+getHouseNo());
		System.out.println("City: "+getCity());
		System.out.println("Pin: "+getPin());
	}
}
