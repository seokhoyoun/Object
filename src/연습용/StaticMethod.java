package 연습용;

public class StaticMethod {
	private static String value;
	
	public StaticMethod(String value) {
		this.value = value;
	}
	
	public static void setValue() {
		
	}
	
	public static String getValue(String value) {
		
		return value;
	}
	
	public static void toUpper() {
		System.out.println(value.toUpperCase());
	}
	
	public static void setChar(String value) {
		
	}
	
	public static int valueLength() {
		return 0;
	}
	
	public static String valueConcat(String value) {
		return null;
	}
}
