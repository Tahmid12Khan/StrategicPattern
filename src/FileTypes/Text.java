package FileTypes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import DataTypes.Student;

public class Text implements Files{

	@Override
	public String writeFile(Student s) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(s.toString());
		return sb.toString() + System.lineSeparator();
		
	}

	
}
