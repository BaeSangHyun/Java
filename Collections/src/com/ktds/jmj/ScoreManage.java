package com.ktds.jmj;

import java.util.List;

public class ScoreManage {
	/**
	 * 점수의 총점을 담는 변수
	 */
	private int sum;
	/**
	 * 점수의 평균을 담는 변수
	 */
	private double avg;
	
	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	/**
	 * 점수의 총점을 구한다.
	 * @param score List를 넣어 for문을 돌면서 각 값을 sum에 더하며 넣는다.
	 */
	public void getSumScore(List<Integer> score) {
		for(int i = 0; i < 10; i ++){
			this.sum += score.get(i);
		}
		System.out.println("총점은 : " + this.sum);
	}
	
	/**
	 * 총점과 과목수인 list의 사이즈를 이용하여 평균을 구한다. 
	 * @param count list의 사이즈
	 */
	public void getAvgScore(double count) {
		this.avg = this.sum/count;
		System.out.println("평균은 : " + this.avg);
	}
	
	/**
	 * 평균값으로 학점을 구한다.
	 */
	public void getGrade() {
		if( this.avg <= 100 && this.avg > 90 ){
			System.out.println("A ㅊㅋㅊㅋ");
		}
		else if( this.avg <= 91 && this.avg > 80 ){
			System.out.println("B");
		}
		else if( this.avg <= 81 && this.avg > 70 ){
			System.out.println("C");
		}
		else if( this.avg <= 71 && this.avg > 60 ){
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}
	

}
