package com.biz.grade.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FlieWrtier_02 {

	public static void main(String[] args) {
		String scoreFlie = "src/com/biz/grade/data/score_02.txt";
		
		FileWriter fileWriter;
		PrintWriter printWriter;
		Random rnd =new Random();
		try {
			fileWriter= new FileWriter(scoreFlie);
			printWriter=new PrintWriter(fileWriter);
			for (int i=0 ; i <100 ; i ++) {
				int intnum= i +1;
				int intkor=rnd.nextInt(50)+51;
				int inteng=rnd.nextInt(50)+51;
				int intmath=rnd.nextInt(50)+51;
				
				printWriter.printf("%d:%d:%d:%d\n",intnum,intkor,inteng,intmath);
			}
			printWriter.flush();
			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
