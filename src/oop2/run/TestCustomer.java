package oop2.run;

import oop2.model.vo.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		// 클래스 사용
		// 클래스명 레퍼런스변수;
		// reference : 참조
		// 레퍼런스 = 객체의 주소 기록함.
		// heap에는 주소값으로만 접근이 가능하다. (배열,인스턴스)
		Customer test; // stack에 저장
		
		// 레퍼런스변수 = new 생성자([초기값]);
		// 생성자에 의해 heap 메모리에 해당 클래스에 대한 인스턴스(객체)를 할당하고 그 주소를 레퍼런스에 기록.
		test = new Customer();
		System.out.println(test.hashCode());
		
		// 클래스가 가진 메소드 사용
		// void일땐 안씀-[자료형 변수=]레퍼런스.메소드명([전달값- 매개변수가 없으면 안씀]);
		test.printCustomer();
		
		Customer test2 = new Customer(123,"ddd");
		System.out.println("test 2 :"+test2.hashCode());
		test2.printCustomer();
		
	}

}
