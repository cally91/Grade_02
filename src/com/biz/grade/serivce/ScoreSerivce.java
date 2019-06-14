package com.biz.grade.serivce;
/*
 * 1. 성적입력; void inputScore(int number)
 * 2. 총점계산 :void total()
 * 3. 석차계산 :void rank()
 * 4. 성적리스트 ;void viewList()
 * 5. 전체 평균계산: deptAvg()
 * 6. 전체 평균 보기:void deptAvgView
 */
public interface ScoreSerivce {

	public boolean inputScore(int number) throws NumberFormatException; 
	public void total(); 
	public void rank();
	public void viewList();
	public int deptAvg();
	public void deptAvgView();
}
