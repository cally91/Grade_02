package com.biz.grade.serivce;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.grade.model.ScoreVO;

public class ScoreSerivceiceimp_05 implements ScoreSerivce {

	private List<ScoreVO> scList;
	private FileReader flieReader;
	private BufferedReader buffer;

	public ScoreSerivceiceimp_05() {
		// this(10);

	}

	public ScoreSerivceiceimp_05(String scoreFile) throws FileNotFoundException {
		scList = new ArrayList<ScoreVO>();
		flieReader = new FileReader(scoreFile);
		buffer = new BufferedReader(flieReader);

	}

	@Override
	public boolean inputScore(int number) throws NumberFormatException {
		String reader = "";

		try {
			while (true) {
				reader = buffer.readLine();
				if (reader == null)
					break;

				String[] scores = reader.split(":");
				int intnum = Integer.valueOf(scores[0]);
				int intkor = Integer.valueOf(scores[1]);
				int inteng = Integer.valueOf(scores[2]);
				int intmath = Integer.valueOf(scores[3]);

				ScoreVO vo = new ScoreVO();
				vo.setNumber(intnum);
				vo.setKor(intkor);
				vo.setEng(inteng);
				vo.setMath(intmath);

				scList.add(vo);
			}
		} catch (IOException e) {
			return true;

		}

		return false;
	}

	@Override
	public void total() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rank() {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
