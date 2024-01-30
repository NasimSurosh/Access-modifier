package third_Assignment;

public class Undergraduate extends Student{
	
	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void display() {
		super.display();
		System.out.println("year: " + year);
	}

}
