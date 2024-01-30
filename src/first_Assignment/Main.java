package first_Assignment;

public class Main {

	public static void main(String[] args) {

		Circle circle = new Circle();

		circle.setRadius(6);
		circle.setColor("blue");
		circle.display();

		System.out.println("================");

		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(5);
		rectangle.setWidth(6);
		rectangle.setColor("brown");
		rectangle.display();

	}

}
