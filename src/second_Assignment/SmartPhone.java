package second_Assignment;

public class SmartPhone extends ElectricDevice{

	private String operatingSystem;

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public void display() {
		super.display();
		System.out.println("Operating system is: " + operatingSystem);
	}
}
