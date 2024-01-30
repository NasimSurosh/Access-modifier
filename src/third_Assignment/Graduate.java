package third_Assignment;

public class Graduate extends Student{
	
	private String researchTopic;

	public String getResearchTopic() {
		return researchTopic;
	}

	public void setResearchTopic(String researchTopic) {
		this.researchTopic = researchTopic;
	}
	
	public void display() {
		super.display();
		System.out.println("research topic is: "+ researchTopic);
	}

}
