package gitPro;

import java.util.Arrays;
import java.util.Scanner;

public class proj_20190413_2 {

	//�� ���� A, B, C�� �־�����. �̶�, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int a = scan.nextInt();
		
		System.out.print("���� �Է�: ");
		int b = scan.nextInt();
		
		System.out.print("���� �Է�: ");
		int c = scan.nextInt();
		
		int arrN[] = {a,b,c};
		
		Arrays.sort(arrN);
		
		System.out.println("�ι�°�� ū ���� : "+ arrN[1]);
	}

}
