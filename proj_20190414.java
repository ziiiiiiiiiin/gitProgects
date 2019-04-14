package gitPro;

import java.util.Arrays;
import java.util.Scanner;

public class proj_20190414 {

	/*
	 * 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
	 * 이 점수의 평균 구하기
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("과목 개수 입력: ");
		int cnt = scan.nextInt();
		
		double arrScore[] = new double[cnt];
		
		for(int i=0;i<arrScore.length;i++){
			
			System.out.print("점수 입력: ");
			arrScore[i]  = scan.nextInt();
			
		}
		
		
		Arrays.sort(arrScore);	
		
		int maxScore = (int)arrScore[arrScore.length-1];
		double total = 0;
		
		for(int i=0; i<arrScore.length;i++){
			arrScore[i] = (arrScore[i]/maxScore)*100;
			total += arrScore[i];
		}
		
		double val = total / arrScore.length;
		
		System.out.println(val);
	}

}
