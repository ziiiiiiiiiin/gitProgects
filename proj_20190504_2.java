package gitPro;

import java.util.Scanner;

public class proj_20190504_2 {
	//�� �����ڰ� ���� �� ������ �־����� ��, ����ڿ� ���� ���� ���ϱ�
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int scoreArr[][] = new int[5][4]; //�������迭�� ������ 5�� 4���� ���� �ִ´�
		int total[] = new int[5]; // �� �࿡ ���� ���� ���� ��ĥ �迭�� �����Ѵ�
		
		for(int i=0;i<5;i++){
			for(int j=0;j<4;j++){
				System.out.println("���� �Է� : ");
				scoreArr[i][j] = scan.nextInt();
				total[i] += scoreArr[i][j];
			}
		}
		
		//���� �迭�� ������ ���ϰ� �ִ밡 ������ ��� ���� ��ȣ�� ����ؾ� �ϹǷ� 0���� �ʱ�ȭ�� cnt�� 1�� �����ش�
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
