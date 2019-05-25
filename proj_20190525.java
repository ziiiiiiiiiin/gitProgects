package gitPro;

import java.util.Scanner;

public class proj_20190525 {
	/*측정한 높이는 길이가 N인 수열로 나타낼 수 있다. 여기서 오르막길은 적어도 2개의 수로 이루어진 높이가 증가하는 부분 수열이다. 
	 *오르막길의 크기는 부분 수열의 첫 번째 숫자와 마지막 숫자의 차이이다.
	 *가장 큰 오르막길을 구하기
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수열(길 개수) : ");
		int num = scan.nextInt();
		
		int maxHeight = 0;
		int finalHeight = 0;
		
		int stCnt[] = new int[num];
		
		System.out.println("길 높이 입력 : ");
		stCnt[0] = scan.nextInt();
		
		for(int i = 1;i < num;i++){
			System.out.println("길 높이 입력 : ");
			stCnt[i] = scan.nextInt();
			
			/*이전 높이와 현재높이를 비교해 현재가 높다면 그건 오르막길이므로 높이를 더해줌. 
			 *얘를 +1로 해야 부분수열로(3 5 7 10) 오르막길이 계속될 떄 계속 증가되는 높이를 구할 수 있다.
			 *높지 않다면 그건 내리막이거나 같은 높이로 높이를 더하는 변수에 값을 더해서는 안된다.
			 *현재까지 더해진 높이와 최종 높이를 비교해 그 값을 변수에 넣고 더해진 높이의 변수를 다시 0으로 초기화해 새로 더해주게끔한다
			 */
			if(stCnt[i] - stCnt[i-1] > 0){
				maxHeight += (stCnt[i] - stCnt[i-1]);
			}else{
				finalHeight = Math.max(finalHeight, maxHeight);
				maxHeight = 0;
			}
			
		}
		//최종 오르막길 높이는 길이끝날때까지 길의 높이를 더한 변수(maxHeight)와 그전에 오르막길 높이에 대한 값을 넣은 변수(finalHeight)를 비교해 나온 최대값이다
		System.out.println("가장 큰 오르막길 높이 : "+Math.max(finalHeight, maxHeight));
	}

}
