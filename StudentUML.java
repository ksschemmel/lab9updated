
public class StudentUML {

	private String Name;
	private int age;
	private String major;
	private String hobby;
	private double GPA;
	private int Spent_time_learn_JAVA;
	
	public StudentUML()
	{
		this.Name=" ";
		this.age=0;
		this.major=" ";
		this.hobby=" ";
		this.GPA=0;
		this.Spent_time_learn_JAVA=0;
	}
	
	public StudentUML(String Name, int age, String major, String hobby, double GPA, int Spent_time_learn_JAVA){
		this.Name=Name;
		this.age=age;
		this.major=major;
		this.hobby=hobby;
		this.GPA=GPA;
		this.Spent_time_learn_JAVA=Spent_time_learn_JAVA;
	}
	public String getName() {
		return Name;
	}
	public int getage() {
		return age;
	}
	public String getmajor() {
		return major;
	}
	public String gethobby() {
		return hobby;
	}
	public double getGPA() {
		return GPA;
	}
	public int getSpenttimelearnJAVA() {
		return Spent_time_learn_JAVA;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public void setage(int age) {
		this.age=age;
	}
	public void setmajor(String major) {
		this.major=major;
	}
	public void sethobby(String hobby) {
		this.hobby=hobby;
	}
	public void setGPA(double GPA) {
		this.GPA=GPA;
	}
	public void setSpenttimelearnJAVA(int Spent_time_learn_JAVA) {
		this.Spent_time_learn_JAVA=Spent_time_learn_JAVA;
	}
	public String HonorsEligible() {
		String Honors;
		if(GPA>=3.5)
			Honors="true";
		else 
			Honors="false";
		return Honors;
	}public static void main(String[] args) {
		StudentUML Student1 = new StudentUML();
		Student1.setName("Kailey");
		Student1.setGPA(3.8);
		Student1.setSpenttimelearnJAVA(3);
		
		System.out.println("Student's honors eligibilty check: " + Student1.HonorsEligible());
	}
	
			
	}


