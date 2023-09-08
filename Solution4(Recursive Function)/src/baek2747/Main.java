package baek2747;

import java.util.*;

public class Main {
	

	public static int fibonacci(int n) {
		
		int i = 2;
		int[] num = new int[n + 1];
		num[0] = 0;
		num[1] = 1;
		
		while (true) {
			if (i - 1 == n) {
				return num[i - 1];
			}
			else {
				num[i] = num[i - 1] + num[i - 2];
				i++;
			}
		
		}
		
	}
	
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = fibonacci(n);
		System.out.print(res);		
		
	}
}