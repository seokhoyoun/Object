package 연습용;

import java.util.Scanner;

public class EmpTest {
	

	public static void main(String[] args) {
		mainMenu();
	}
	
	public static void mainMenu() {
		Scanner scanner = new Scanner(System.in);
		Employee a1 = new Employee(); int m_num;
		do {
			System.out.print("	******* 사원 정보 관리 프로그램 ************\r\n" + 
					"\r\n" + 
					"	1. 새 사원 정보 입력\r\n" + 
					"	2. 사원 정보 수정 \r\n" + 
					"	3. 사원 정보 삭제\r\n" + 
					"	4. 사원정보 출력 \r\n" + 
					"	9. 끝내기"
					+ "메뉴 번호 입력 : ");
					m_num = scanner.nextInt();
			
			switch(m_num) {
			case 1 : a1.empInput(); break;
			case 2 : modifyMenu(); break;
			case 3 :  break;
			case 4 : a1.empOutput(); break;
			case 9 : break;
			}
		}while(m_num != 9);
	}
	
	public static void modifyMenu() {
		Employee a1 = new Employee();
		Scanner scanner = new Scanner(System.in); int m_num;
		System.out.print("	**** 사원 정보 수정 메뉴 *****\r\n" + 
				"	1. 이름 변경 => setEmpName()\r\n" + 
				"	2. 급여 변경 => setSalary()\r\n" + 
				"	3. 부서 변경 => setDept()\r\n" + 
				"	4. 직급 변경 => setJob()\r\n" + 
				"	5. 이전 메뉴로 이동 => return 처리할 것");
				m_num = scanner.nextInt();
				
			switch(m_num){
			case 1 : a1.setEmpName(); break;
			case 2 : a1.setSalary(); break;
			case 3 : a1.setDept(); break;
			case 4 : a1.setJob(); break;
			case 5 : return;
			}
	}
}
