package gitPro;

import java.util.ArrayList;
import java.util.Scanner;

public class proj_20190512 {

	/*
	 * ù° �ٿ� ������ �� N (1 �� N �� 150)�� �־�����. ���� N�� �ٿ��� �� ������ ���� �־�����. (���� ���ĺ� �ҹ��ڷθ� �̷���� �ְ�, �ִ� 30�����̴�) 
	 * ���� ù ���ڰ� ���� ������ 5���� ���ٸ� "PREDAJA" (����ǥ ����)�� ����Ѵ�. 
	 * ������ �� �ִ� ��쿡�� ������ ���� ù ���ڸ� ���������� ������� ��� ����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��� �� �Է� : ");
		int cnt = scan.nextInt();
		
		int arr[] = new int[26]; //�̸��� ù���ڰ� ���� �迭�� ���ĺ��� 26�ڱ��� �־� 26���� ��������
		
		/* �̸��� ù���ڸ� �迭�� �ֱ����� �ƽ�Ű �ڵ带 �̿��Ѵ�
		 * �ƽ�Ű�ڵ忡�� ���ĺ��� 97�����̹Ƿ� ù��° ������ ������ 97�� ������ �迭�� ��ġ�� ���ϰ� �ش� �迭�� ���� ����������
		 * ���� ��� ù���ڰ� a�� ��� a�� �ƽ�Ű�ڵ�� 97, ���� ���� �� 97���� �ƽ�Ű�ڵ� ���ĺ� �������� 97�� �� 0�� a�� ��ġ�̸� arr[0]�� ���� ���������ش�
		 * �� arr[0] = a, arr[1] = b ,,, arr[25] = z��� �����ϸ� �ȴ� 
		 */
		for(int i=0;i<cnt;i++){
			System.out.println("�̸� �Է� : ");
			String name = scan.next();
			
			char firstName = name.charAt(0);
			
			arr[firstName-97]++;
		}
		
		String res = "";
		
		// �迭�� �ֱ����� 97�� ������ �긦 �ٽ� ���ĺ����� ����ؾ� �ϹǷ� 97�� �����־�� �Ѵ�
		for(int i=0;i<arr.length;i++){
			if(arr[i] >= 5){
				res += (char)(i+97); 
			}
		}
		if(!"".equals(res)){
			System.out.println(res);
		}else{
			System.out.println("PREDAJA");
		}
	}

}
