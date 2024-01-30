package third_Assignment;

public class Student {
	private String name;
	private int studentID;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public int getStudentID() {
		return studentID;
	}
	public void display() {
		System.out.println("Name of student is: " + name);
		System.out.println("ID number:" + studentID);
	}
}
