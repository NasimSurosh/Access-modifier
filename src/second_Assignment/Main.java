package second_Assignment;

public class Main {

	public static void main(String[] args) {
		
		DerivedTelevision television = new DerivedTelevision();
		System.out.println("Television information");
		television.setBrand("sony");
		television.setScreenSize(60);
		television.setPrice(900);
		television.display();
		
		System.out.println();
		SmartPhone phone = new SmartPhone();
		System.out.println("Mobile phone information");
		phone.setBrand("IPHONE 14 plus");
		phone.setOperatingSystem("ios");
		phone.setPrice(1.450);
		phone.display();

	}

}
