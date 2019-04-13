package gitPro;

import java.util.Arrays;
import java.util.Scanner;

public class proj_20190413_2 {

	//세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int a = scan.nextInt();
		
		System.out.print("정수 입력: ");
		int b = scan.nextInt();
		
		System.out.print("정수 입력: ");
		int c = scan.nextInt();
		
		int arrN[] = {a,b,c};
		
		Arrays.sort(arrN);
		
		System.out.println("두번째로 큰 정수 : "+ arrN[1]);
	}

}
