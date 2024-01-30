package third_Assignment;

import java.util.HashMap;


public class Main {

	public static void main(String[] args) {
		
		Graduate graduate = new Graduate();
		System.out.println("List of graduate student ");
		graduate.setName("Alex");
		graduate.setStudentID(345);
		graduate.setResearchTopic("A bout nature");
		graduate.display();
		 System.out.println("========");
		 
		Undergraduate undergraduate = new Undergraduate();
		System.out.println("List of undergraduate student ");
		System.out.println("1. ");
		undergraduate.setName("Lisa");
		undergraduate.setStudentID(543);
		undergraduate.setYear(7);
		undergraduate.display();
		System.out.println("2. ");
		undergraduate.setName("Joy");
		undergraduate.setStudentID(765);
		undergraduate.setYear(6);
		undergraduate.display();
		
		
		HashMap<Integer, Student> graduateMap = new HashMap<>();
		
         graduateMap.put(graduate.getStudentID(), graduate);
         graduateMap.put(undergraduate.getStudentID(), undergraduate);
         
       
	

	}

}
