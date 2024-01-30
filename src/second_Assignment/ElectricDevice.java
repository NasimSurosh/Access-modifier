package second_Assignment;

public class ElectricDevice {
	protected String brand;
	protected double price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void display() {
		System.out.println("Brand is: "+ brand);
		System.out.println("the price is: " + price + " \u20ac");
	}

}
