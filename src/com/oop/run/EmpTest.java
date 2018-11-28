package com.oop.run;

import java.util.Scanner;

import com.oop.model.dto.Employee;

public class EmpTest {
	
	
	public static void main(String[] args) {
		EmpTest.mainMenu();
	}
	
	
	public static void mainMenu() {
		Employee e1 = new Employee();
		Scanner scanner = new Scanner(System.in);
		 int m_num;
		do {
			System.out.print("\n	******* 사원 정보 관리 프로그램 ************\r\n" + 
					"\r\n" + 
					"	1. 새 사원 정보 입력\r\n" + 
					"	2. 사원 정보 수정 \r\n" + 
					"	3. 사원 정보 삭제\r\n" + 
					"	4. 사원 정보 출력 \r\n" + 
					"	9. 끝내기 \r\n"
					+ "	메뉴 번호 입력 : ");
					m_num = scanner.nextInt();
			
			switch(m_num) {
			case 1 : e1.empInput(); break;
			case 2 : modifyMenu(e1); break;
			case 3 : e1.setInit(); break; // 주소값이 달라지므로 변경 필요 - (완료)
			case 4 : e1.empOutput(); break;
			case 9 : break;
			}
		}while(m_num != 9);
	}
	
	public static void modifyMenu(Employee e1) { //매개변수로 인스턴스 주소값?
		
		Scanner scanner = new Scanner(System.in); int m_num;
		do {
			System.out.print("\n	**** 사원 정보 수정 메뉴 *****\r\n" + 
					"	1. 이름 변경 \r\n" + 
					"	2. 급여 변경 \r\n" + 
					"	3. 부서 변경 \r\n" + 
					"	4. 직급 변경 \r\n" + 
					"	5. 이전 메뉴로 이동 "
					+ "메뉴 번호 입력 : ");
			m_num = scanner.nextInt();
			
			switch(m_num){
			case 1 : System.out.print("\n변경 할 이름을 입력하세요 : "); e1.setEmpName(scanner.next()); break;
			case 2 : System.out.print("\n변경 할 급여를 입력하세요 : "); e1.setSalary(scanner.nextInt()); break;
			case 3 : System.out.print("\n변경 할 부서를 입력하세요 : "); e1.setDept(scanner.next()); break;
			case 4 : System.out.print("\n변경 할 직급을 입력하세요 : "); e1.setJob(scanner.next()); break;
			case 5 : return;
			}
		}while(m_num != 5);
	}
}
