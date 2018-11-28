package com.oop.model.dto;

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
	
		public Employee() {
			
		}
	
		public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary,
				double bonusPoint, String phone, String address) {
			this.empNo = empNo;
			this.empName = empName;
			this.dept = dept;
			this.job = job;
			this.age = age;
			this.gender = gender;
			this.salary = salary;
			this.bonusPoint = bonusPoint;
			this.phone = phone;
			this.address = address;
		}

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
			System.out.println("사번 : "+empNo);
			System.out.println("사원 이름 : "+empName);
			System.out.println("부서 : "+dept);
			System.out.println("직급 : "+job);
			System.out.println("나이 : "+age);
			System.out.println("성별 : "+gender);
			System.out.println("급여 : "+ salary);
			System.out.println("포인트 : "+ bonusPoint);
			System.out.println("전화번호 : "+phone);
			System.out.println("주소 : "+address);
		}
		
		public void setInit() {
			this.empNo = 0;
			this.empName = null;
			this.dept = null;
			this.job = null;
			this.age = 0;
			this.gender = '\u0000';
			this.salary = 0;
			this.bonusPoint = 0;
			this.phone = null;
			this.address = null;
		}

	

		public int getEmpNo() {
			return empNo;
		}

		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}

		public String getJob() {
			return job;
		}

		public void setJob(String job) {
			this.job = job;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public double getBonusPoint() {
			return bonusPoint;
		}

		public void setBonusPoint(double bonusPoint) {
			this.bonusPoint = bonusPoint;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
}

