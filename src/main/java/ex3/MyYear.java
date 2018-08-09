package ex3;

public class MyYear {

	private int year;
	
	public MyYear(int year) {
		this.year = year;
	}

	public boolean verify_is_leap() {
		return isDivisibleBy(4) ? (isDivisibleBy(100) ? isDivisibleBy(400) : true) : false;
	}
	
	private boolean isDivisibleBy(int number)
	{
		return (year % number == 0 ? true : false);		
	}
}
