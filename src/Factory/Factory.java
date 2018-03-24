package Factory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

import DataTypes.Student;
import FileTypes.CSV;
import FileTypes.Files;
import FileTypes.TSV;
import FileTypes.Text;
import FileTypes.XML;

public class Factory {
	public void process(ArrayList<Student> s) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Path");
		String name = sc.nextLine();
		//sc.nextLine();
		TreeMap<String, Files> tm = new TreeMap<String, Files>();
		//Files f =(Files) new Text();
		tm.put("1",  new Text());
		tm.put("2",  new CSV());
		tm.put("3",  new TSV());
		tm.put("4",  new XML());
		
		System.out.println("Enter 1 for txt\nEnter 2 for CSV\nEnter 3 for TSV\nEnter 4 for XML");
		String choice = sc.nextLine();
		int size = s.size();
		
		try {
			FileWriter fw = new FileWriter(name);
			for(int i = 0; i < size; i++) {
				//System.out.println(s.get(i).name);
				//Files f = tm.get(i);
				//Text t = (Text) tm.get(i);
				//Text t1 = new Text();
				//System.out.println(tm.get(choice).writeFile(s.get(i)));
				fw.write(tm.get(choice).writeFile(s.get(i)));
				
			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
