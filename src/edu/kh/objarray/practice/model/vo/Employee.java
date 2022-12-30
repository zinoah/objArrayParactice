package edu.kh.objarray.practice.model.vo;

public class Employee {
	//사번, 이름, 부서, 직급, 급여
	private int number;
	private String name;
	private String division;
	private String position;
	private int wage;
	
	
	//기본 생성자
	public Employee() {}

	//매개변수 생성자
	public Employee(int number, String name, String division, String position, int wage) {
		super();
		this.number = number;
		this.name = name;
		this.division = division;
		this.position = position;
		this.wage = wage;
	}
	
	
	// getter / setter
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}
	
	public String toString() {
		return "사번: " + number + ", 이름: " + name + ", 부서: " + division + ", 직급: " + position 
				+ ", 급여: " + wage;
	}
}
