package com.biz.grade.controller;

import com.biz.grade.serivce.ScoreSerivce;
import com.biz.grade.serivce.ScoreSerivceiceimp_03;

public class ScoreExec_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arrLen= 30;
		/*
		 * 인터페이스가 마련되어있는 클래스는
		 * 선언할때는 인터페이스로 선언을 한다.
		 */
		//ScoreSerivce_01 sService =new ScoreSerivceiceimp_01();
		ScoreSerivce sService =new ScoreSerivceiceimp_03(); // 10개의 고정된 배열
	//	sService= new ScoreSerivceiceimp_02(arrLen); //30개의 지정한 배열 
		
		//키보드를 통해서 30명의 성적을 입력받는 메서드를 호출하는 부분
		for(int i=0 ; i <arrLen; i++) {
			if(sService.inputScore(i)) break;
			}
		sService.total();
		sService.rank();
		sService.viewList();
		
		int intDeptAvg=sService.deptAvg();
		
		System.out.println("전체평균 :"+intDeptAvg);
		
		sService.deptAvgView();
	}

}
