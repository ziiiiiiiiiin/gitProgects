package gitPro;

import java.util.Scanner;

public class proj_20190525 {
	/*������ ���̴� ���̰� N�� ������ ��Ÿ�� �� �ִ�. ���⼭ ���������� ��� 2���� ���� �̷���� ���̰� �����ϴ� �κ� �����̴�. 
	 *���������� ũ��� �κ� ������ ù ��° ���ڿ� ������ ������ �����̴�.
	 *���� ū ���������� ���ϱ�
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����(�� ����) : ");
		int num = scan.nextInt();
		
		int maxHeight = 0;
		int finalHeight = 0;
		
		int stCnt[] = new int[num];
		
		System.out.println("�� ���� �Է� : ");
		stCnt[0] = scan.nextInt();
		
		for(int i = 1;i < num;i++){
			System.out.println("�� ���� �Է� : ");
			stCnt[i] = scan.nextInt();
			
			/*���� ���̿� ������̸� ���� ���簡 ���ٸ� �װ� ���������̹Ƿ� ���̸� ������. 
			 *�긦 +1�� �ؾ� �κм�����(3 5 7 10) ���������� ��ӵ� �� ��� �����Ǵ� ���̸� ���� �� �ִ�.
			 *���� �ʴٸ� �װ� �������̰ų� ���� ���̷� ���̸� ���ϴ� ������ ���� ���ؼ��� �ȵȴ�.
			 *������� ������ ���̿� ���� ���̸� ���� �� ���� ������ �ְ� ������ ������ ������ �ٽ� 0���� �ʱ�ȭ�� ���� �����ְԲ��Ѵ�
			 */
			if(stCnt[i] - stCnt[i-1] > 0){
				maxHeight += (stCnt[i] - stCnt[i-1]);
			}else{
				finalHeight = Math.max(finalHeight, maxHeight);
				maxHeight = 0;
			}
			
		}
		//���� �������� ���̴� ���̳��������� ���� ���̸� ���� ����(maxHeight)�� ������ �������� ���̿� ���� ���� ���� ����(finalHeight)�� ���� ���� �ִ밪�̴�
		System.out.println("���� ū �������� ���� : "+Math.max(finalHeight, maxHeight));
	}

}
