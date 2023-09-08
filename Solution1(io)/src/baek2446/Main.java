package baek2446;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < 2 * n - 1; i++) {
			if (i < n) {
				for (int j = 0; j < 2 * i - i; j++) {
					System.out.print(" ");
					}
				for (int j = 0; j < 2 * n - 2 * i - 1; j++) {
					System.out.print("*");
				}				
			System.out.println();
			}
			else {
				for (int j = 0; j < 2 * n - i - 2; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2 * i - 2 * n + 3; j++) {
					System.out.print("*");
				}
			System.out.println();	
			}
		}
	}
}