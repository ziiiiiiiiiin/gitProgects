package gitPro;

import java.util.Scanner;

public class proj_20190504 {

	/*
	 * 1���� 8���� ���ʴ�� �����Ѵٸ� ascending, 8���� 1���� ���ʴ�� �����Ѵٸ� descending, �� �� �ƴ϶�� mixed 
	 * ������ ������ �־����� ��, �̰��� ascending����, descending����, �ƴϸ� mixed���� �Ǻ�
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[8];
		
		/*
		 * ���� �迭�� �ϳ��� �޾� ������ ���� ���ؼ� �Ǻ��ϱ�
		 */
		for(int i = 0;i<arr.length;i++){
			System.out.println("�� �Է� : ");
			arr[i] = scan.nextInt();
		}
		int asc = 0;
		int des = 0;
		
		for(int i=0;i<(arr.length)-1;i++){
			if(arr[0] == 1){
				if(arr[i]<arr[i+1]){
					asc ++;
				}
			}
			else if(arr[7]==1){
				if(arr[i]>arr[i+1]){
					des++;
				}
			}
		}
		
		if(asc == 7){
			System.out.println("ascending");
		}else if(des == 7){
			System.out.println("descending");
		}else{
			System.out.println("mixed");
		}
		
	}

}
