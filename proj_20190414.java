package gitPro;

import java.util.Arrays;
import java.util.Scanner;

public class proj_20190414 {

	/*
	 * �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
	 * �� ������ ��� ���ϱ�
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ���� �Է�: ");
		int cnt = scan.nextInt();
		
		double arrScore[] = new double[cnt];
		
		for(int i=0;i<arrScore.length;i++){
			
			System.out.print("���� �Է�: ");
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
