package gitPro;

import java.util.Scanner;

public class proj_20190413 {

	//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 입력: ");
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
