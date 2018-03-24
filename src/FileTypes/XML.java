package FileTypes;

import java.lang.*;
import java.lang.reflect.Field;

import DataTypes.Student;

public class XML implements Files {

	@Override
	public String writeFile(Student s) {
		String top = "<Student>";
		String endTop = "</Student>";
		String tagName = "<name>";
		String endTagName = "</name>";
		String tagEmail = "<email>";
		String endTagEmail = "</email>";
		
		Field [] fields = Student.class.getFields();
		String [] str = s.toString().split(" ");
		int cnt = 0;
		String res = top + System.lineSeparator();
		for(Field f: fields) {
			res += "\t" + "<" + f.getName() + "> " + str[cnt++] + " </" + f.getName() + ">" + System.lineSeparator(); 
		}
		
		res += endTop + System.lineSeparator();
		
		
		// TODO Auto-generated method stub
		return res;
	}

}
