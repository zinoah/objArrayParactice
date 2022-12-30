package edu.kh.objarray.practice.model.service;

import java.util.Scanner;

import edu.kh.objarray.practice.model.vo.Employee;

public class EmployeeService {
	private Employee[] employees = new Employee[3]; // 사원 정보를 저장할 Employee 배열
	private Scanner sc = new Scanner(System.in); 

	
	
	public void displayMenu() {
		
		int sel = 0;
		do {
			
			System.out.println("=== 직원 관리 프로그램 ===");
			System.out.println("1. 직원 정보 입력(3명)");
			System.out.println("2. 모든 직원 정보 출력");
			System.out.println("3. 특정 직원 정보 출력(이름 검색)");
			System.out.println("4. 특정 직원 급여/연봉 출력(사번 검색)");
			System.out.println("5. 모든 직원 급여 합/연봉 합 출력");
			System.out.println("6. 모든 직원중 급여가 가장 높은 직원의 이름, 부서, 급여 출력");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 >> ");
			sel = sc.nextInt();
			sc.nextLine();
			
			switch (sel) {
			case 1:  initEmployee(); break;
			case 2:  System.out.println(allEmployeesInformation());  break;
			case 3:  System.out.println(searchEmployee());; break;
			case 4:  break;
			case 5:  break;
			case 6:  break;
			case 0: System.out.println("프로그램 종료."); break;

			default: System.out.println("잘못 입력하셨습니다.");
			}
			
		}while(sel != 0);
		
	}
	
	// 3명의 직원 정보를 입력받아 배열에 각 요소에 초기화  
	public void initEmployee() {
		// 사번, 이름, 부서, 직급, 급여 순서로 입력받기
		for(int i = 0; i < employees.length; i++) {
			
			System.out.println("=== " + (i + 1) + "번째 사원 정보 입력 ===");
			System.out.print("사번 : ");
			int number = sc.nextInt();
			sc.nextLine();
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("부서 : ");
			String division = sc.nextLine();
			
			System.out.print("직급 : ");
			String position = sc.nextLine();
			
			System.out.print("급여 : ");
			int wage = sc.nextInt();
			sc.nextLine();
			
			Employee member = new Employee(number ,name ,division ,position ,wage);
			
			employees[i] = member;
		}
	}
	
	
	// 모든 직원 정보를 하나의 문자열로 반환
	public String allEmployeesInformation() {
		
		String result = "";
		
		for(int i = 0; i < employees.length; i++) {
			
			if(employees[i] == null) {
				result = "저장된 정보 없음";
			}else {
				result += employees[i].toString() + "\n";
			}
		}
		return result;
	}
	
	// 특정 사원 정보 반환 메소드(이름 검색)
	// 일치하는 이름이 없을 경우 "일치하는 이름의 사원이 없습니다." 반환
	public String searchEmployee() {
		System.out.println("=== 특정 사원 정보 출력(이름 검색) ===");
		
		System.out.println("이름 입력 : ");
		String input = sc.nextLine();
		String result = "";
		
		for(int i = 0; i < employees.length; i++) {
			if(employees[i].getName().equals(input)) {
				result = employees[i].toString();
			}else {
				result = "일치하는 이름의 사원이 없습니다.";
			}
		}
		return result;
	}
	
	
	// 입력받은 사번과 일치하는 직원의 급여, 연봉 정보 반환(연봉 == 급여 * 12)
	// 일치하지 않는 경우 "사번이 일치하는 직원 없습니다." 반환
	public String salaryCheck() {
		System.out.println("=== 급여/연봉 조회 ===");
		System.out.println("사번 입력 : ");
		int input = sc.nextInt();
		sc.nextLine();
		return null;
	}
	
	
	// 모든 사원 급여 합 반환
	public int allSalaryCheck() {
		
		return 0;
	}
	
	// 모든 직원중 급여가 가장 높은 직원 출력
	// (동일한 급여인 경우 사번이 낮은 사람이 출력)
	public void topSalaryEmployee() {
	
		
	}
}
