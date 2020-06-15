package basic;

import java.util.Scanner;

public class AddNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		String Num;
		N = sc.nextInt();
		Num = sc.next();
		
		int hap = 0;
		
		for(int i = 0; i < N; i++)
		{
			int now = Num.charAt(i)-'0';
			hap+=now;
		}
		
		System.out.println(hap);
		
	}

}
