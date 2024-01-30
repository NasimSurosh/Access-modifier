package first_Assignment;

public class Rectangle extends Shape {
	private double width;
	private double height;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void display() {
		super.disply();
		System.out.println("the height of rectangle is: " + height);
		System.out.println("The width of rectingle is :" + width);
		System.out.println("The area of rectingale is: " + width * height);
	}
}
