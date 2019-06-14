package com.biz.grade.model;

public class SrudantVO {

	private int number;
	private String name;
	private int grade;
	private String addr;
	private String tal;

	private String dept;

	

	public SrudantVO(int number, String name, int grade) {
		super();
		this.number = number;
		this.name = name;
		this.grade = grade;
	}

	public SrudantVO(int number, String name, int grade, String addr, String tal, String dept) {
		super();
		this.number = number;
		this.name = name;
		this.grade = grade;
		this.addr = addr;
		this.tal = tal;
		this.dept = dept;
	}

	public SrudantVO() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTal() {
		return tal;
	}

	public void setTal(String tal) {
		this.tal = tal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "SrudantVO [number=" + number + ", name=" + name + ", grade=" + grade + ", addr=" + addr + ", tal=" + tal
				+ ", dept=" + dept + "]";
	}


}
