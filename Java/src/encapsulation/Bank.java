package encapsulation;

public class Bank {
		private int pinNumber;
		
		public int getPinNumber() {
			return pinNumber;
		}

		public void setPinNumber(int pinNumber)
		{
			this.pinNumber = pinNumber;
		}

		
		public void validate(int pinNumber)
		{
			if((pinNumber==1001) || (pinNumber==1234)||(pinNumber==1212))
			System.out.println("Valid pin number");	
			else
				System.out.println("Not valid pin number");
		}
		
		
	}

