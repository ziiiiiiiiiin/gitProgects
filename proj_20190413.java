package gitPro;

import java.util.Scanner;

public class proj_20190413 {

	//���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int score = scan.nextInt();
		
		if(score >= 90){
			System.out.println("A");
		}else if(80<= score && score < 90){
			System.out.println("B");
		}else if(70<= score && score < 80){
			System.out.println("C");
		}else if(60<= score && score < 70){
			System.out.println("D");
		}else{
			System.out.println("F");
		}
		
	}

}
