package gitPro;

import java.util.Scanner;

public class proj_20190609_2 {
	
	/*학생 5명의 점수가 주어졌을 때, 평균 점수를 구하는 프로그램을 작성하시오
	 *단 40점 미만인 학생들은 보충학습을 듣는 조건을 수락하면 40점을 받게 된다. 
	 *보충학습은 거부할 수 없기 때문에, 40점 미만인 학생들은 항상 40점을 받게 된다 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int scoreArr[] = new int[5];
		int total = 0;
		int avg = 0;
		for(int i=0;i<scoreArr.length;i++){
			scoreArr[i] = scan.nextInt();
			
			if(scoreArr[i] < 40){
				scoreArr[i] = 40;
			}
			
			total += scoreArr[i]; 
		}
		
		avg = total/5;
		
		System.out.println(avg);
	}

}
