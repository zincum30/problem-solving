package baek2839;

/*
 * 1. N = 5 * a + 3 * b + c
 * 2. N 보다 작을 때까지 a를 1씩 늘린다.
 * 3. a를 늘린 뒤 N이 0이 될 때까지 b를 늘린다. -> a + b 를 출력
 * 4. a를 늘린 뒤 N이 0이 되지 않으면 a를 하나 줄이고 b를 늘린다.
 * 5. 5번을 반복한다. -> a + b 를 출력
 * 6. 
 */

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int f = -1;
		int i = n % 5;
		int a = n / 5;
		int b = i / 3;
		
				
		if (i == 0) { 
			System.out.print(a);
		}
		else if (i % 3 == 0) {
			System.out.print(a + b);
		}
		else {
			for (int j = 1; a - j >= 0; j++) {
				if ((i + (5 * j)) % 3 == 0){
					System.out.print((a - j) + (i + 5 * j) / 3);
					return;
				}	
			}
			System.out.print(f);
		}
	}
}