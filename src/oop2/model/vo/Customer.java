package oop2.model.vo;

public class Customer {
	// 클래스의 구성 요소
	// 1. 멤버 변수(field) : 자료형이 다른 변수들의 묶음(구조체)
	// 구조체 + 보안기능  = 클래스 => 캡슐화
	// 필드를 캡슐화 : private 접근제한자 사용 (클래스 내부에서만 접근 가능)
	
	// 접근제한자 [예약어] 자료형 변수명 [= 초기값]
	private int id;// 고객 아이디
	private String name;// 이름
	private int age;// 나이
	private char gender;// 성별
	private String phone;// 전화번호
	private String address;// 주소
	private double point;// 누적포인트
	
	// 2. 생성자(Constructor)
	// new 할 때만, 실행되는 초기화 메소드이다.
	// new 할 때 해당 클래스에 대한 객체(인스턴스)가 heap(자유 메모리 영역)에 만들어 질 때,
	//  인스턴스 안에 할당되는 필드들의 초기값 처리 담당
	
	// 접근 제한자 클래스명(){필드 = 초기값;}
	// 접근 제한자 클래스명(자료형 변수명){}
	// 생성자는 오버로딩(overloading) 가능함 : 같은 이름의 메소드를 여러 개 중복 작성하는 것.
	// 메소드 이름은 같아도 자료형이 다르거나 매개변수의 갯수가 다름 (반환형은 상관x)
	
	// 생성자는 일반적으로 접근제한자로 public을 사용한다. (패키지 안/밖으로 모두 접근 가능)
	// 기본(default) 생성자
	public Customer() {
		// 생성자와 메소드 안에는 this 레퍼런스가 존재한다.
		// 해당 생성자나 메소드가 사용될 때, this 가 자동으로 주소를 전달받는다.
		System.out.println(this.hashCode());
	}
	// 매개변수가 있는 생성자
	public Customer(int id, String name) { // 필드와는 다른 변수이다.
		System.out.println(this.hashCode());
		this.id = id;
		this.name = name;
	}
	public Customer(int id, String name,int age, char gender, String phone, String address, double point) {
		System.out.println(this.hashCode());
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
		this.point = point;
	}
	
	// 3.멤버함수(Method)
	// 접근제한자 반환자료형 메소드명([자료형 변수]){}
	
	public void printCustomer() {
		System.out.println("printCustomer : " + this.hashCode());
		System.out.println(this.id + ","+ this.name +","+ this.age+","+this.gender+","+this.phone+","+this.address+","+this.point);
	}
	
}
