package gitPro;

import java.util.Scanner;

public class proj_20190602 {

	//각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("케이스 수 : ");
		int caseCnt = scan.nextInt();
		
		String caseArr[] = new String[caseCnt];
		//평균을 소수점 셋째자리까지 구해야하므로 애초에 double로 초기화해주어야 함 
		double average = 0;
		double peoCnt = 0;
		double avgRate = 0;
		
		/*사람 수에 해당하는 배열을 만들어 각각의 점수를 여기에 넣고
		 *케이스 수에 해당하는 배열을 만들어 각 케이스 별 인원의 평균 점수를 구해 넣어준다 */
		for(int i = 0;i < caseCnt;i++){
			System.out.println("사람 수 : ");
			double people = scan.nextInt();
			double score[] = new double[(int) people];
			double total = 0;
			
			for(int j = 0;j < people;j++){
				System.out.println("평균 : ");
				score[j] = scan.nextInt();
				total += score[j];
			}
			
			average = total / people;
			
			for(int k = 0;k < people;k++){
				if(score[k] > average){
					peoCnt++;
				}
			}
			avgRate = (peoCnt / people)*100;
			//소수점 이하의 수가 0인경우 이를 절삭하지 않으려면 math.round가 아닌 String.format을 쓴다
			caseArr[i] = String.format("%.3f", avgRate); 
			
			peoCnt = 0;
		}
		
		for(int l = 0; l < caseCnt;l++){
			System.out.println("평균 넘는 사람들 비율 : "+caseArr[l]+"%");
		}
	}

}
