package com.biz.grade.serivce;

import java.util.Random;

import com.biz.grade.model.ScoreVO;

public class ScoreSerivceiceimp_01 implements ScoreSerivce {

	ScoreVO[] scArray;
	Random rnd;

	public ScoreSerivceiceimp_01() {
		// TODO Auto-generated constructor stub
		scArray = new ScoreVO[10];
		rnd = new Random();
	}

	public ScoreSerivceiceimp_01(int arrLen) {
		scArray = new ScoreVO[arrLen];
		rnd = new Random();
	}

	@Override
	public boolean inputScore(int number) throws NumberFormatException {
//		난수를 만들어서 3개의 성적을 생성
		// scArray[number]=new ScoreVO();
		ScoreVO vo = new ScoreVO();
		int intkor = rnd.nextInt(50) + 51;
		int inteng = rnd.nextInt(50) + 51;
		int intmath = rnd.nextInt(50) + 51;
		vo.setNumber(number + 1);
		vo.setKor(intkor);
		vo.setEng(inteng);
		vo.setMath(intmath);

		scArray[number] = vo;

		scArray[number] = new ScoreVO();
		scArray[number].setNumber(number + 1);
		scArray[number].setKor(intkor);
		scArray[number].setEng(inteng);
		scArray[number].setMath(intmath);
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
		for (int i= 0; i <scArray.length;i++) {
			for (int j= i+1 ; j<scArray.length;j++) {
				if (Integer.valueOf(scArray[i].getTotel())<Integer.valueOf( scArray[j].getTotel())) {
					ScoreVO _a = scArray[i];
					scArray[i] = scArray[j];
					scArray[j]= _a;
				}
			}
		}
		int rank=0;
		for (ScoreVO vo : scArray) {
			vo.setRank(++rank);
		}
		
		
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

		// 전체 학생의 반평균
		int avgtotal = 0;
		for (ScoreVO vo : scArray) {
			avgtotal += vo.getAvereage();
		}
		avgtotal /= scArray.length;
		return avgtotal;
	}

	@Override
	public void deptAvgView() {
		// TODO Auto-generated method stub

	}

}
