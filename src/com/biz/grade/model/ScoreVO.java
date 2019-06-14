package com.biz.grade.model;

public class ScoreVO {

	private int number;
	private int kor;
	private int eng;
	private int math;
	
	private int totel;
	private int avereage;
	
	private int rank;

	

	public ScoreVO(int number, int kor, int eng, int math, int totel, int avereage) {
		super();
		this.number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.totel = totel;
		this.avereage = avereage;
	}

	public ScoreVO(int number, int kor, int eng, int math) {
		super();
		this.number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public ScoreVO(int number, int kor, int eng, int math, int totel, int avereage, int rank) {
		super();
		this.number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.totel = totel;
		this.avereage = avereage;
		this.rank = rank;
	}
	public ScoreVO() {
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotel() {
		return totel;
	}

	public void setTotel(int totel) {
		this.totel = totel;
	}

	public int getAvereage() {
		return avereage;
	}

	public void setAvereage(int avereage) {
		this.avereage = avereage;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "ScoreVO [number=" + number + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", totel=" + totel
				+ ", avereage=" + avereage + ", rank=" + rank + "]";
	}
	
	
	
}
