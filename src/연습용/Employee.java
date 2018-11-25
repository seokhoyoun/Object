package 연습용;

import java.util.Scanner;

public class Employee {
	private Scanner scanner = new Scanner(System.in);
	private int empNo;
	private String empName;
	private String dept; // 소속 부서
	private String job; // 직급
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
		public void empInput() {
			System.out.print("사번 : ");
			empNo = scanner.nextInt();
			System.out.print("이름 : ");
			empName = scanner.next();
			System.out.print("소속부서 : ");
			dept = scanner.next();
			System.out.print("직급 : ");
			job = scanner.next();
			System.out.print("나이 : ");
			age = scanner.nextInt();
			System.out.print("성별(m/f) : ");
			gender = scanner.next().toLowerCase().charAt(0);
			System.out.print("급여 : ");
			salary = scanner.nextInt();
			System.out.print("보너스 포인트 : ");
			bonusPoint = scanner.nextDouble();
			System.out.print("핸드폰 번호 : ");
			phone = scanner.next();
			System.out.print("주소 : ");
			scanner.nextLine();
			address = scanner.nextLine();
			System.out.println();
		}
		
		public void empOutput() {
			System.out.println(empNo);
			System.out.println(empName);
			System.out.println(dept);
			System.out.println(job);
			System.out.println(age);
			System.out.println(gender);
			System.out.println(salary);
			System.out.println(bonusPoint);
			System.out.println(phone);
			System.out.println(address);
		}
		
		public String setName(String newName) {//이름 변경용
			return newName;
			// 필드 값 변경용 메소드
		}

		public String setEmpName() {
			System.out.print("이름 : ");
			empName = scanner.next();
			return empName;
		}

		public int setSalary() {
			System.out.print("급여 : ");
			salary = scanner.nextInt();
			return salary;
			
		}

		public String setDept() {
			System.out.print("소속부서 : ");
			dept = scanner.next();
			return dept;
		}

		public String setJob() {
			System.out.print("직급 : ");
			job = scanner.next();
			return job;
		}
}
