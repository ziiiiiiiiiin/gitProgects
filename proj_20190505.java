package gitPro;

import java.util.ArrayList;
import java.util.Scanner;

public class proj_20190505 {

	//�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϱ�
	public static void main(String[] args) {

		Scanner scan =  new Scanner(System.in);
		int num[] =  new int[10];
		int remainder[] = new int[10];
		ArrayList<Integer> comp = new ArrayList<Integer>();
		
		for(int i= 0;i<num.length;i++){
			System.out.println("�� �Է� : ");
			num[i] = scan.nextInt();
			remainder[i] = num[i] % 42;
			
			//�ߺ�Ȯ�� : ArrayList�� contains �Լ� ���. �迭�ϳ��� ����� �ߺ����� ���� ���鸸 �ش� �迭�� ����
			if(!comp.contains(remainder[i])){
				comp.add(remainder[i]);
			}
		}
		System.out.println(comp.size());
		
	}

}
