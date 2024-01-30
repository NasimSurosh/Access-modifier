package first_Assignment;

public class Circle extends Shape {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void display() {
		super.disply();
		System.out.println("the radius of circle is: " + radius);
		System.out.println("The area of circle is :" + Math.PI * radius * radius);
	}
}
