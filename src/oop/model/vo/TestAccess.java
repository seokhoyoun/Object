package oop.model.vo;

import java.util.Scanner;

public class TestAccess {
	public void test() {
		Person a = new Person();
		/*Scanner scanner = new Scanner(System.in);
		a.name = "홍길동";
		System.out.print("이름 : ");
		a.name = scanner.next();*/
		
		a.inputName();
		a.printPerson();
	}
}
