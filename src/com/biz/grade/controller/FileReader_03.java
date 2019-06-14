package com.biz.grade.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class FileReader_03 {

	public static void main(String[] args) {

		String scoreFlie="src/com/biz/grade/data/score.txt";
		FileReader fileReader ;
		BufferedReader buffer;
		try {
			fileReader =new FileReader(scoreFlie);
			buffer=new BufferedReader(fileReader);
			String reader = "";
			
			while(true) {
				reader =buffer.readLine();
				if (reader==null)break;
				// 파일에서 읽은 판줄의 문자열을 쿨론(:)중심으로 분해하여
				//scores 문자열배열에 담는다
				String[] scoers=reader.split(":");
				System.out.printf("학번:%s\t점수:%s\n",scoers[0],scoers[1]);
			}
		} catch (FileNotFoundException e) {

			//e.printStackTrace();
			System.out.println("파일없습");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("파일 이상 발생");
		}
		
		
	}

}
