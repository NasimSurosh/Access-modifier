package first_Assignment;

public class Shape {
	protected String color;

	protected String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void disply() {
		System.out.println("Color is: " + color);
	}

}
