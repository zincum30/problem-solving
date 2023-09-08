package baek2445;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 0; i < 2 * num - 1; i++) {
			
			if (i < num) {
			
				for (int j = 0; j < i + 1; j++) {				
					System.out.print("*");			
				}
				
				for (int k = 0; k < 2 * num - 2 - 2 * i; k++) {
					System.out.print(" ");
				}
				
				for (int l = 0; l < i + 1; l++) {
					System.out.print("*");
				}			
				System.out.println("");
			}
			
			else {
				
				for (int j = 0; j < 2 * num - i - 1; j++) {
					System.out.print("*");
				}		
				for (int k = 0; k < 2 * i - 2 * num + 2; k++) {
					System.out.print(" ");
				}
				for (int l = 0; l < 2 * num - i - 1; l++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			
		}
		
	}
	
}