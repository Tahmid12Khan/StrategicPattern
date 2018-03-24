package DataTypes;

public class Student {
	public String name;
	public String email;
	
	public Student(String name, String email) {
		this.name = name;
		this.email = email;
	}
	public Student() {
		
	}
	
	public String toString() {
		return name + " " + email;
	}
}
