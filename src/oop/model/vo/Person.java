package oop.model.vo;

import java.util.Scanner;

public class Person {
	// 자료형이 다른 변수 (필드)들의 묶음 + 접근제한기능 = 클래스의 목적
	// 멤버변수(Field) != 지역변수 
	// 멤버 변수는 heap에 저장 - 지역 변수는 stack에 저장
	// 접근제한자 [예약어] 자료형 필드명 [= 초기값]
	private String name; // 이름
	private int age;
	private char gender;
	private String phone;
	private double point;
	
	//생성자(Constructor)
	
	
	// 멤버함수 (메소드)
	public void inputName() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scanner.next();
	}
	
	public void printPerson() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+gender);
		System.out.println("전화번호 : "+phone);
		System.out.println("포인트 : "+point);
	}
}
