package gitPro;

import java.util.Arrays;
import java.util.Scanner;

public class proj_20190407 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ATM 대기 인원 수 : ");
		int people = scan.nextInt();
		
		int arrP[] = new int[people];
		
		for(int i = 0;i<arrP.length;i++){
			System.out.print("사람"+(i+1)+"대기 시간 : ");
			arrP[i] = scan.nextInt();			
		}
		Arrays.sort(arrP);
		
		int totalTime = arrP[0];
		for(int i = 1;i<arrP.length;i++){
			arrP[i] = arrP[i-1] + arrP[i];
			totalTime += arrP[i] ;
		}
		System.out.println("총 대기시간 : "+totalTime+"분");
	}
}
