package gitPro;

import java.util.Scanner;

public class proj_20190609 {
	/*
	 * 첫째 줄에는 A×B×C의 결과에 0 이 몇 번 쓰였는지 출력한다. 
	 * 마찬가지로 둘째 줄부터 열 번째 줄까지 A×B×C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int res = a*b*c;
		
		int numArr[] = new int[10];
		int numChk = 0;
		
		/*십진수를 이용한다.(10으로 나눈 나머지가 해당 자릿수의 수)
		 *각자리수(0~9)를 체크할 배열(int[10])을 만들고
		 *a,b,c를 곱한수의 나머지를 각자릿수별로 돌며 체크한다  
		 * */
		while(res > 0){
			numChk = res%10;
			res = res/10;
			numArr[numChk]++;//즉 1의자릿수가 0이면 numArr[0]의 값이 증가하는것, 이렇게 세 수를 곱한 수를 돌면서 체크하는것이다.
		}
		
		for(int i=0;i<numArr.length;i++){
			System.out.println(numArr[i]);
		}
	}

}
