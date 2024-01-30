package second_Assignment;

public class DerivedTelevision extends ElectricDevice{
	private int screenSize;

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	public void display() {
		super.display();
		System.out.println("Screen size is: " + screenSize +" inch");
	}

}
