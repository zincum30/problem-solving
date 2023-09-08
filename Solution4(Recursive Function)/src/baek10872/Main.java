package baek10872;

import java.util.*;

public class Main {
	 
	
	public static int kwang (int n) {
		
		int num = n + 1;
		int[] fac = new int[num];
		int[] arr = new int[num];
		fac[0] = arr[0] = 1;
		
		
		for (int i = 1; i < num; i++) {
			arr[i] = i;
		}
		
		for (int i = 1; i < num; i++) {
			fac[i] = fac[i - 1] * arr[i];
		}
		
		return fac[n];
		
	}
	
	
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = kwang(n);
		System.out.print(res);
		
	}
}