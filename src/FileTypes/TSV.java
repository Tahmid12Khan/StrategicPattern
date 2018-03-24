package FileTypes;



import DataTypes.Student;

public class TSV implements Files {

	@Override
	public String writeFile(Student s) {
		StringBuilder sb = new StringBuilder(s.toString());
		for(int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i) == ' ') {
				sb.setCharAt(i, '\t');
			}
		}
		return sb.toString() + System.lineSeparator();

	}
}
