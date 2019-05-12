package gitPro;

import java.util.ArrayList;
import java.util.Scanner;

public class proj_20190512 {

	/*
	 * 첫째 줄에 선수의 수 N (1 ≤ N ≤ 150)이 주어진다. 다음 N개 줄에는 각 선수의 성이 주어진다. (성은 알파벳 소문자로만 이루어져 있고, 최대 30글자이다) 
	 * 성의 첫 글자가 같은 선수가 5명보다 적다면 "PREDAJA" (따옴표 없이)를 출력한다. 
	 * 선발할 수 있는 경우에는 가능한 성의 첫 글자를 사전순으로 공백없이 모두 출력한다.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("사람 수 입력 : ");
		int cnt = scan.nextInt();
		
		int arr[] = new int[26]; //이름의 첫글자가 들어가는 배열로 알파벳은 26자까지 있어 26으로 제한해줌
		
		/* 이름의 첫글자를 배열에 넣기위해 아스키 코드를 이용한다
		 * 아스키코드에서 알파벳은 97부터이므로 첫번째 글자의 수에서 97을 뺀것을 배열의 위치로 정하고 해당 배열의 값을 증가시켜줌
		 * 예를 들어 첫글자가 a인 경우 a의 아스키코드는 97, 따라서 글자 수 97에서 아스키코드 알파벳 시작점인 97을 뺀 0이 a의 위치이며 arr[0]의 값을 증가시켜준다
		 * 즉 arr[0] = a, arr[1] = b ,,, arr[25] = z라고 생각하면 된다 
		 */
		for(int i=0;i<cnt;i++){
			System.out.println("이름 입력 : ");
			String name = scan.next();
			
			char firstName = name.charAt(0);
			
			arr[firstName-97]++;
		}
		
		String res = "";
		
		// 배열에 넣기위해 97을 뺐으나 얘를 다시 알파벳으로 출력해야 하므로 97을 더해주어야 한다
		for(int i=0;i<arr.length;i++){
			if(arr[i] >= 5){
				res += (char)(i+97); 
			}
		}
		if(!"".equals(res)){
			System.out.println(res);
		}else{
			System.out.println("PREDAJA");
		}
	}

}
