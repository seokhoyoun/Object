package 연습용;

public class TestStatic {

	public static void main(String[] args) {
		StaticMethod sm = new StaticMethod();
		StaticMethod.setValue("abcdefg");
		System.out.println(StaticMethod.getValue());
		StaticMethod.toUpper();
		System.out.println(StaticMethod.getValue());
		StaticMethod.setChar(0, '★');
		System.out.println(StaticMethod.getValue());
		System.out.println(StaticMethod.valueLength());
		System.out.println(StaticMethod.valueConcat("☆"));
	}

}
