package gitPro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class proj_20190427 {

	/*
	 * �̸��ڴ� 30�̶� ���� �����ϱ� ������, �״� ��Ÿ����� ã�� ���� ���Ե� ���ڵ��� ���� 30�� ����� �Ǵ� ���� ū ���� ����� �;��Ѵ�
	 * �̸��ڰ� ����� �;��ϴ� ���� �����Ѵٸ� �� ���� ����϶�. �� ���� �������� �ʴ´ٸ�, -1�� ����϶�.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String num = scan.next();
		
		/* 30�� ����� ���� : 3���� ������ �������ų� 30ó�� ���ڸ��� 0�ΰ�. 369�� ��� 3���� ������ �������� ���ڸ��� 0�� �ƴϹǷ� 30�� ����� �ƴϴ�
		 * �� ���� ���� ���ϴ� total, ���ڸ� 0�� �Ǵ��ϴ� zero�� ������ ����
		 * �Է��� ���� int�� �ƴ� ��Ʈ������ �޾ƾ� charAt���� �� �ڸ��� ���� ���� �� �ִ�.
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
	     * �� �ڸ��� ���� ���� 30�� ��� ���ǿ� �����ϴٸ� arraylist�� �־��� ���� ū ���� ��������Բ� ������������ �����Ѵ�.
	     * �迭�̱⶧���� �迭 ���̸�ŭ for���� ���� �긦 �ϳ��ϳ� ����ؾ� �Ѵ� 
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
