package gitPro;

import java.util.Scanner;

public class proj_20190609_2 {
	
	/*�л� 5���� ������ �־����� ��, ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�
	 *�� 40�� �̸��� �л����� �����н��� ��� ������ �����ϸ� 40���� �ް� �ȴ�. 
	 *�����н��� �ź��� �� ���� ������, 40�� �̸��� �л����� �׻� 40���� �ް� �ȴ� 
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
