package gitPro;

import java.util.ArrayList;
import java.util.Scanner;

public class proj_20190407_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ���� �Է�: ");
		int ranArr = scan.nextInt();
		
		System.out.print("���� ���� �Է�: ");
		int val = scan.nextInt();
		
		int arr[] = new int[ranArr];
		
		for(int i = 0;i<arr.length;i++){
			System.out.print("���� �� �� �Է� : ");
			arr[i] = scan.nextInt();			
		}
		
		ArrayList<Integer> arrX = new ArrayList<Integer>();
		
		for(int i = 0;i<arr.length;i++){
			if(arr[i]<val){
				arrX.add(arr[i]);
			}
		}
		
		for(int i=0;i<arrX.size();i++){
			System.out.println(arrX.get(i));
		}
	}
}
