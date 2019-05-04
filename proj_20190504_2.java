package gitPro;

import java.util.Scanner;

public class proj_20190504_2 {
	//각 참가자가 얻은 평가 점수가 주어졌을 때, 우승자와 그의 점수 구하기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int scoreArr[][] = new int[5][4]; //이차원배열로 선언해 5행 4열로 값을 넣는다
		int total[] = new int[5]; // 각 행에 들어가는 열의 값을 합칠 배열도 선언한다
		
		for(int i=0;i<5;i++){
			for(int j=0;j<4;j++){
				System.out.println("점수 입력 : ");
				scoreArr[i][j] = scan.nextInt();
				total[i] += scoreArr[i][j];
			}
		}
		
		//총합 배열의 점수를 비교하고 최대가 나오는 경우 그의 번호도 출력해야 하므로 0으로 초기화한 cnt에 1을 더해준다
		int max = 0;
		int cnt = 0;
		for(int i=0;i<5;i++){
			if(max < total[i]){
				max = total[i];
				cnt = i+1;
			}
		}
		
		System.out.println(cnt+" "+max);
	}

}
