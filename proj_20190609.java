package gitPro;

import java.util.Scanner;

public class proj_20190609 {
	/*
	 * ù° �ٿ��� A��B��C�� ����� 0 �� �� �� �������� ����Ѵ�. 
	 * ���������� ��° �ٺ��� �� ��° �ٱ��� A��B��C�� ����� 1���� 9������ ���ڰ� ���� �� �� �������� ���ʷ� �� �ٿ� �ϳ��� ����Ѵ�.
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int res = a*b*c;
		
		int numArr[] = new int[10];
		int numChk = 0;
		
		/*�������� �̿��Ѵ�.(10���� ���� �������� �ش� �ڸ����� ��)
		 *���ڸ���(0~9)�� üũ�� �迭(int[10])�� �����
		 *a,b,c�� ���Ѽ��� �������� ���ڸ������� ���� üũ�Ѵ�  
		 * */
		while(res > 0){
			numChk = res%10;
			res = res/10;
			numArr[numChk]++;//�� 1���ڸ����� 0�̸� numArr[0]�� ���� �����ϴ°�, �̷��� �� ���� ���� ���� ���鼭 üũ�ϴ°��̴�.
		}
		
		for(int i=0;i<numArr.length;i++){
			System.out.println(numArr[i]);
		}
	}

}
