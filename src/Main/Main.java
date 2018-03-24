package Main;

import java.util.ArrayList;

import DataTypes.Student;
import Factory.Factory;
import FileTypes.Text;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> a = new ArrayList<Student>();
		a.add(new Student("Tahmid", "801"));
		a.add(new Student("Tahmid", "801"));
		a.add(new Student("Tahmid", "801"));
		Factory f = new Factory();
		f.process(a);
		Text t = new Text();
		String s = t.writeFile(a.get(1));
		

	}

}
