package gitPro;

import java.util.Scanner;

public class proj_20190616 {
	/*
	 * OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. 
	 * OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�׽�Ʈ���̽� : ");
		int testCase = scan.nextInt();
		
		int score = 0;
		int ret[] = new int[testCase]; //�� ���̽��� ���� O�� ���� ������ ���� �迭
		
		for(int i=0;i<testCase;i++){
			System.out.println("���� : "+i);
			String oxCase = scan.next();
			
			for(int j=0;j<oxCase.length();j++){
				if(oxCase.charAt(j) == 'O'){
					score++;
					ret[i] += score;
				}else{
					score= 0;
				}
			}
			score= 0; //�ϳ��� ���̽��� ���� ��������� ������ score�� �ʱ�ȭ�ؾ� ���� ���̽��� �������� ����
		}
		
		for(int i=0;i<testCase;i++){
			System.out.println("��� : "+ret[i]);
		}
	}
}
