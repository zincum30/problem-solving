package baek11052;

/*
 * 1. (Pi / i)의 몫을(소수점까지) 구한다.
 * 2. 가장 몫이 큰 값의 (index + 1)과 N 값을 비교한다.
 * 3. N의 값과 (index + 1)의 값이 같도록 Pi의 값과 개수를 조절한다.
 * 4. N과 (index + 1)의 값이 같아지면 선택된 Pi의 값을 모두 더해 출력한다.
 */

import java.util.*;
import java.util.stream.Stream;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String[] str = sc.nextLine().split(" ");
		int[] pi = Stream.of(str).mapToInt(Integer::valueOf).toArray();
		
		for (int i = 0; i < str.length; i++) {
			pi[i] = Integer.parseInt(str[i]);
		}
		
		
	}
}