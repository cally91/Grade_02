package com.biz.grade.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_01 {

	public static void main(String[] args)  {
/*
 * data.txt 파일을 읽어서 그내용을 콘솔에 보이기
 */
	
		String sreFlie="src/com/biz/grade/data/data.txt";
		FileReader fileReader;
		BufferedReader buffer;
		
			try {
				fileReader =new FileReader(sreFlie);
				buffer =new BufferedReader(fileReader);
				String reader= "";
				for (int i =0 ;i <5; i++) {
					reader =buffer.readLine();
					System.out.println(reader);
					
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("data.txt 파일이 없습니다.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("파일을 읽는중에 문제가 발생!!");
			}
	}

}
