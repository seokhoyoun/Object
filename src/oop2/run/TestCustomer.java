package oop2.run;

import java.util.Scanner;

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
//		System.out.println(test.hashCode());
		
		// 클래스가 가진 메소드 사용
		// void일땐 안씀-[자료형 변수=]레퍼런스.메소드명([전달값- 매개변수가 없으면 안씀]);
		test.printCustomer();
		
		Customer test2 = new Customer(123,"ddd");
//		System.out.println("test 2 :"+test2.hashCode());
		test2.printCustomer();
		test2.setID(33);
		test2.setName("박문수");
		test2.setAge(25);
		test2.setGender('남');
		test2.setPhone("010-3322-1234");
		test2.setAddress("서울시 강남구");
		test2.setPoint(30.0);
		test2.printCustomer();
		
		test.setID(993);
		test.setAge(33);
		test.setName("김이박");
		test.setPhone("010-2135-1235");
		test.setGender('남');
		test.setAddress("경기도 안양시");
		test.printCustomer();
		
		// 키보드로 입력받은 값으로 기록 처리
		/*Customer test3 = new Customer();
		Scanner scanner = new Scanner(System.in);*/
		/*int id = scanner.nextInt();
		test3.setID(id);*/
		/*System.out.print("아이디 (숫자) : ");
		test3.setID(scanner.nextInt());
		System.out.print("이름 : ");
		test3.setName(scanner.next());
		System.out.print("나이 : ");
		test3.setAge(scanner.nextInt());
		System.out.print("성별 [남/여] : ");
		test3.setGender(scanner.next().charAt(0));
		System.out.print("전화번호 : ");
		test3.setPhone(scanner.next());
		System.out.print("주소 : ");
		scanner.nextLine();
		test3.setAddress(scanner.nextLine());
		System.out.print("포인트 : ");
		test3.setPoint(scanner.nextDouble());
		test3.printCustomer();
		*/
		// test 가 참조하는 객체의 이름, 나이, 포인트 조회
		
		String name = test2.getName();
		int age = test2.getAge();
		double point = test2.getPoint();
		
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
		System.out.println("포인트 : "+ point);
		
		// 객체 나이 평균 계산
		int avg = (test.getAge() + test2.getAge())/2;
		System.out.println("나이 평균 : "+ avg);
		
	}

}
