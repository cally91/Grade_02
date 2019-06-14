package com.biz.grade.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FlieWriter_01 {

	public static void main(String[] args) {

		String scoreFlie = "src/com/biz/grade/data/score_01.txt";

		FileWriter flieWriter;
		PrintWriter printer;

		try {
			flieWriter = new FileWriter(scoreFlie);
			printer = new PrintWriter(flieWriter);
			for (int i = 0; i < 100; i++) {
				printer.println(i);
			}
			/*
			 * 파일쓰기(기록)기능은 
			 * 내용을 기록하는 코드가 수행되더라도 
			 * 실제 파일에 내용을 저장하지않는다.
			 * 
			 * 그래서 파일내용을 강제로 저장하도록 메서드를 실행 해주어야한다.
			 */
			printer.flush();// 필수
			printer.close();// 필수
			flieWriter.close(); // 선택
			System.out.println("파일 기록 완료!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("알수없는이유로 파일 생성못함");
		}

	}

}
