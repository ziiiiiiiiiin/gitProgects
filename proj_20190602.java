package gitPro;

import java.util.Scanner;

public class proj_20190602 {

	//�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ���
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("���̽� �� : ");
		int caseCnt = scan.nextInt();
		
		String caseArr[] = new String[caseCnt];
		//����� �Ҽ��� ��°�ڸ����� ���ؾ��ϹǷ� ���ʿ� double�� �ʱ�ȭ���־�� �� 
		double average = 0;
		double peoCnt = 0;
		double avgRate = 0;
		
		/*��� ���� �ش��ϴ� �迭�� ����� ������ ������ ���⿡ �ְ�
		 *���̽� ���� �ش��ϴ� �迭�� ����� �� ���̽� �� �ο��� ��� ������ ���� �־��ش� */
		for(int i = 0;i < caseCnt;i++){
			System.out.println("��� �� : ");
			double people = scan.nextInt();
			double score[] = new double[(int) people];
			double total = 0;
			
			for(int j = 0;j < people;j++){
				System.out.println("��� : ");
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
			//�Ҽ��� ������ ���� 0�ΰ�� �̸� �������� �������� math.round�� �ƴ� String.format�� ����
			caseArr[i] = String.format("%.3f", avgRate); 
			
			peoCnt = 0;
		}
		
		for(int l = 0; l < caseCnt;l++){
			System.out.println("��� �Ѵ� ����� ���� : "+caseArr[l]+"%");
		}
	}

}
