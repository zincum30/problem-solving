package baek2440;

import java.util.Scanner;

public class Main {

		
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for (int i = num; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	} 
}