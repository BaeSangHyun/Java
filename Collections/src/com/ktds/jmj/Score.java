package com.ktds.jmj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Score {
	ScoreManage manage = new ScoreManage();
	List<Integer> score = new ArrayList<Integer>();
	Scanner input = new Scanner(System.in);
	
	public void start() {
		for ( int i = 1; i <= 10; i++){
			System.out.print(i + "번째 과목의 점수를 입력하세요. : ");
			int num = input.nextInt();
			score.add(num);
		}
		manage.getSumScore(score);
		manage.getAvgScore(score.size());
		manage.getGrade();
	}

	public static void main(String[] args) {
		Score test = new Score();
		test.start();

	}
}
