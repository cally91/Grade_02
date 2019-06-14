package com.biz.grade.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class FileReader_05 {

	public static void main(String[] args) {

		String scoreFlie = "src/com/biz/grade/data/score.txt";
		FileReader fileReader;
		BufferedReader buffer;
		try {
			fileReader = new FileReader(scoreFlie);
			buffer = new BufferedReader(fileReader);
			String reader = "";
			int intTotal = 0;
			System.out.println("빅제이터반 성적표");
			System.out.println("==================");
			System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
			System.out.println("===========================");
			
			while (true) {
				reader = buffer.readLine();
				if (reader == null)
					break;
				
				//score.txt 파일의 한줄에
				//콜론을 기준으로 4개에 값이 있으므로
				//scoers는 4개짜리 배열로 생성된다.
				String[] scoers = reader.split(":");

				// score.txt파일에서 문자열을 읽어서
				// 점수부분의 총합을 계산
				String Number =scoers[0];
				int intkor = Integer.valueOf(scoers[1]);
				int inteng = Integer.valueOf(scoers[2]);
				int intmath = Integer.valueOf(scoers[3]);
				int intSum= intkor+inteng+intmath;
				intTotal = intSum;
				System.out.printf("%s\t%d\t%d\t%d\t%d\n", Number, intkor, inteng, intmath,intSum) ;
			}
			System.out.println("===============");
			System.out.println("총점:" + intTotal);
		} catch (FileNotFoundException e) {

			// e.printStackTrace();
			System.out.println("파일없습");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일 이상 발생");
		}

	}

}
