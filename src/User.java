
public class User {
	
	private String first;
	private String last;
	private int age;
	private int birthMonth;
	private String color;
	private int siblings;
	
	public User() {
		first = "";
		last = "";
		age = 0;
		birthMonth = 0;
		color = "";
		siblings = 0;
		}
	
	public String getFirst() {			//all getters and setters for User object
		return first;
	}

	public String getLast() {
		return last;
	}
	public int getAge() {
		return age;
	}
	public int getMonth() {
		
		return birthMonth;
	}
	public String getColor() {
		return color;
	}
	public int getSiblings() {
		return siblings;
	}
	public void setNames(String fullName) {
		int space = fullName.indexOf(" ");
		first = fullName.substring(0, space); 
		last = fullName.substring(space + 1);
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setBirthMonth(int month) {
		this.birthMonth = month;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setSiblings(int siblings) {
		this.siblings = siblings;
	}
}


