package com.biz.grade.serivce;

import java.util.Random;
import java.util.Scanner;

import com.biz.grade.model.ScoreVO;
import com.biz.grade.model.SrudantVO;

public class ScoreSerivceiceimp_02 implements ScoreSerivce {

	ScoreVO[] scArray;
	Random rnd;
	Scanner scan;

	/*
	 * 갱겅자가 매개변수를 달리해서 중복되어 만들어지고 있다. 이렇게되면 생성자에서 실행할 코드들이 같은 코드가 반복되는 불편한 상황이된다.
	 * 
	 * 매개변수가 없는 생성자에서 매개변수(매열의 개수)가 있는 생성자를 호출할수있는 방법이 있으면 좋겠다
	 */
	public ScoreSerivceiceimp_02() {
//		scArray = new ScoreVO[10];
//		rnd = new Random();
//		scan = new Scanner(System.in);
		// 나 자신에게 10이란 값을 전달하는 생성자를 호출하라
		// 매개변수가 있는 생성자를 호출하는 코드
		this(10);
	}

	// 배열의 개수를 매개변수로 받는 생성자
	public ScoreSerivceiceimp_02(int arrLen) {
		scArray = new ScoreVO[arrLen];
		for( int i = 0; i<scArray.length;i++) {
			scArray[i] =new ScoreVO();
		}
		rnd = new Random();
		scan = new Scanner(System.in);
	}

	@Override
	public boolean inputScore(int number) throws NumberFormatException {

		System.out.print((number + 1) + "번 국어점수 입력(--END)종료>>");

		String strkor = scan.nextLine();
		if (strkor.equals("--END"))
			return true;

		int intkor = Integer.valueOf(strkor);

		System.out.print((number + 1) + "번 영어점수 입력>>");
		String streng = scan.nextLine();
		int inteng = Integer.valueOf(streng);

		System.out.print((number + 1) + "번 수학점수 입력>>");
		String strmath = scan.nextLine();
		int intmath = Integer.valueOf(strmath);

		ScoreVO vo = new ScoreVO();
		vo.setNumber(number+1);
		vo.setKor(intkor);
		vo.setEng(inteng);
		vo.setMath(intmath);

		scArray[number]=vo;
		return false;
		
		
	}

	@Override
	public void total() {

		for (ScoreVO vo : scArray) {
			int intTotel = vo.getKor();
			intTotel += vo.getEng();
			intTotel += vo.getMath();
			vo.setTotel(intTotel);
			vo.setAvereage(intTotel / 3);
		}

	}

	@Override
	public void rank() {


	}

	@Override
	public void viewList() {
		System.out.println("빅데이터반 성적표");
		System.out.println("====================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		for (ScoreVO vo : scArray) {
			System.out.print(vo.getNumber() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotel() + "\t");
			System.out.print(vo.getAvereage() + "\t");

			System.out.println(vo.getRank() + "\t");

		}
		System.out.println("==============================");


	}

	@Override
	public int deptAvg() {
		int avgtotal = 0;
		for (ScoreVO vo : scArray) {
			avgtotal += vo.getAvereage();
		}
		avgtotal /= scArray.length;

		return 0;
	}

	@Override
	public void deptAvgView() {
		// TODO Auto-generated method stub

	}

}
