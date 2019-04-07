package gitPro;

import java.util.ArrayList;
import java.util.Scanner;

public class proj_20190407_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("랜덤 수열 입력: ");
		int ranArr = scan.nextInt();
		
		System.out.print("랜덤 정수 입력: ");
		int val = scan.nextInt();
		
		int arr[] = new int[ranArr];
		
		for(int i = 0;i<arr.length;i++){
			System.out.print("수열 내 수 입력 : ");
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
