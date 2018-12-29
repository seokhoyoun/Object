package object.method;

public class TestClone {

	public static void main(String[] args) {
		
		PersonalInfo org = new PersonalInfo("111", 11,  "1111", "1111");
		
		PersonalInfo cpy;
		try {
			cpy = org.clone();
		
		org.setAge(33);
		org.setBz(new Business("22","22"));
		org.showPersonalInfo();
		System.out.println("=======================");
		cpy.showPersonalInfo();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
