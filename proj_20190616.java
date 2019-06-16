package gitPro;

import java.util.Scanner;

public class proj_20190616 {
	/*
	 * OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
	 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("테스트케이스 : ");
		int testCase = scan.nextInt();
		
		int score = 0;
		int ret[] = new int[testCase]; //각 케이스에 나올 O에 대한 점수를 넣을 배열
		
		for(int i=0;i<testCase;i++){
			System.out.println("수열 : "+i);
			String oxCase = scan.next();
			
			for(int j=0;j<oxCase.length();j++){
				if(oxCase.charAt(j) == 'O'){
					score++;
					ret[i] += score;
				}else{
					score= 0;
				}
			}
			score= 0; //하나의 케이스에 대한 점수계산이 끝나고 score을 초기화해야 다음 케이스에 더해지지 않음
		}
		
		for(int i=0;i<testCase;i++){
			System.out.println("결과 : "+ret[i]);
		}
	}
}
