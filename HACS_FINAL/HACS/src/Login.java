import java.util.HashMap;

public class Login {
	public int login(String name, String passcodeEntered) {
		HashMap<String, String> student = new HashMap<String, String>();
		HashMap<String, String> instructor = new HashMap<String, String>();
		student.put("pepe", "1111");
		student.put("yaya", "2222");
		student.put("yape", "3333");
		instructor.put("Inst1", "1111");
		
		String password = student.get(name);
		if(passcodeEntered.equals(password))
			return 0;
		if(password == null) {
			password = instructor.get(name);
			if(password.equals(password))
				return 1;
		}
		return 2;
	}
}