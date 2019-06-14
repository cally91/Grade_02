package com.biz.grade.serivce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import com.biz.grade.model.ScoreVO;

public class ScoreSerivceiceimp_03 implements ScoreSerivce {

	List<ScoreVO> scList;
	Random rnd;

	public ScoreSerivceiceimp_03() {
		scList = new ArrayList<ScoreVO>();
		rnd = new Random();
	}

	/*
	 * 난수를 발생하여 과목점수를 생성하고 scList에추가
	 */
	@Override
	public boolean inputScore(int number) throws NumberFormatException {

		int intkor = rnd.nextInt(50) + 51;
		int inteng = rnd.nextInt(50) + 51;
		int intmath = rnd.nextInt(50) + 51;

		ScoreVO vo = new ScoreVO();
		vo.setNumber(number + 1);
		vo.setKor(intkor);
		vo.setEng(inteng);
		vo.setMath(intmath);

		scList.add(vo);
		return false;
	}

	@Override
	public void total() {

		int listLen = scList.size();
		for (ScoreVO vo : scList) {
			int Total = vo.getKor();
			Total += vo.getEng();
			Total += vo.getMath();

			Total = vo.getKor() + vo.getEng() + vo.getMath();

			vo.setTotel(Total);
			vo.setAvereage(Total / 3);
		}
	}

	@Override
	public void rank() {
		Collections.sort(scList, new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO fiest, ScoreVO seopnd) {

				return seopnd.getTotel() -fiest.getTotel();
			}
		});
		int rank = 0;
		for (ScoreVO vo : scList) {
			vo.setRank(++rank);
		}
		Collections.sort(scList, new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO fiest, ScoreVO seopnd) {

				return fiest.getNumber() - seopnd.getNumber();
			}
		});
	}

	@Override
	public void viewList() {
		System.out.println("빅데이터반 성적표");
		System.out.println("====================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		for (ScoreVO vo : scList) {
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deptAvgView() {
		// TODO Auto-generated method stub

	}

}
