package basic;

import java.util.Scanner;
import java.util.StringTokenizer;

public class VocaNum {

	public static void main(String[] args) {
	
		
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		StringTokenizer splitline = new StringTokenizer(str," ");
		int countTokens = splitline.countTokens();
		
		System.out.println(countTokens);
		
	}

}
