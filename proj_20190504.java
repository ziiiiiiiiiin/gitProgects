package gitPro;

import java.util.Scanner;

public class proj_20190504 {

	/*
	 * 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 
	 * 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[8];
		
		/*
		 * 수를 배열로 하나씩 받아 각각의 수를 비교해서 판별하기
		 */
		for(int i = 0;i<arr.length;i++){
			System.out.println("수 입력 : ");
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
