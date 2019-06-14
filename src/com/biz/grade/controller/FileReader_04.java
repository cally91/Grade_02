package com.biz.grade.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class FileReader_04 {

	public static void main(String[] args) {

		String scoreFlie = "src/com/biz/grade/data/score.txt";
		FileReader fileReader;
		BufferedReader buffer;
		try {
			fileReader = new FileReader(scoreFlie);
			buffer = new BufferedReader(fileReader);
			String reader = "";
			int intTotal = 0;
			while (true) {
				reader = buffer.readLine();
				if (reader == null)
					break;
				String[] scoers = reader.split(":");

				// score.txt파일에서 문자열을 읽어서
				// 점수부분의 총합을 계산
				int intScore = Integer.valueOf(scoers[1]);
				intTotal += intScore;
				System.out.printf("학번:%s\t점수:%s\n", scoers[0], scoers[1]);
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
