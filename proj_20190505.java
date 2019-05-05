package gitPro;

import java.util.ArrayList;
import java.util.Scanner;

public class proj_20190505 {

	//수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하기
	public static void main(String[] args) {

		Scanner scan =  new Scanner(System.in);
		int num[] =  new int[10];
		int remainder[] = new int[10];
		ArrayList<Integer> comp = new ArrayList<Integer>();
		
		for(int i= 0;i<num.length;i++){
			System.out.println("수 입력 : ");
			num[i] = scan.nextInt();
			remainder[i] = num[i] % 42;
			
			//중복확인 : ArrayList의 contains 함수 사용. 배열하나를 만들어 중복되지 않은 값들만 해당 배열에 넣음
			if(!comp.contains(remainder[i])){
				comp.add(remainder[i]);
			}
		}
		System.out.println(comp.size());
		
	}

}
