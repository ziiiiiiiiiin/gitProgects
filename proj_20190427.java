package gitPro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class proj_20190427 {

	/*
	 * 미르코는 30이란 수를 존경하기 때문에, 그는 길거리에서 찾은 수에 포함된 숫자들을 섞어 30의 배수가 되는 가장 큰 수를 만들고 싶어한다
	 * 미르코가 만들고 싶어하는 수가 존재한다면 그 수를 출력하라. 그 수가 존재하지 않는다면, -1을 출력하라.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String num = scan.next();
		
		/* 30의 배수의 조건 : 3으로 나누어 떨어지거나 30처럼 뒷자리가 0인것. 369의 경우 3으로 나누어 떨어지나 뒷자리가 0이 아니므로 30의 배수가 아니다
		 * 각 수의 합을 구하는 total, 뒷자리 0을 판단하는 zero를 변수로 선언
		 * 입력한 수를 int가 아닌 스트링으로 받아야 charAt으로 각 자리별 수를 구할 수 있다.
		 */
		int total = 0;
		ArrayList<Integer> arr = new ArrayList<>();
		boolean zero = false;
		
	    for(int i=0; i<num.length();i++) {
	       arr.add(Character.getNumericValue(num.charAt(i)));
	    }
	    for (int n : arr) {
	    	total += n;
	    	if(n == 0){
	    		zero = true;
	    	}
	    }

	    /*
	     * 각 자리별 구한 수가 30의 배수 조건에 부합하다면 arraylist에 넣어줘 가장 큰 수가 만들어지게끔 내림차순으로 정렬한다.
	     * 배열이기때문에 배열 길이만큼 for문을 돌아 얘를 하나하나 출력해야 한다 
	     */
		if(total % 3 == 0 || zero){
			Collections.sort(arr);
	        Collections.reverse(arr);
	        for(int n: arr)
	           System.out.print(n);
		}else{
			System.out.println("-1");
		}
	}

}
