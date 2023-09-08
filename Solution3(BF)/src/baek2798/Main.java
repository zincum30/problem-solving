package baek2798;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	
	public static void main (String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String[] str1 = br.readLine().split(" ");
		int[] n = Arrays.stream(str1).mapToInt(Integer::parseInt).toArray();
		
		String[] str2 = br.readLine().split(" ");
		int[] m = Arrays.stream(str2).mapToInt(Integer::parseInt).toArray();
		
		
		int sum = 0;
		for (int i = 0; i < n[0]; i++) {
			for (int j = i + 1; j < n[0]; j++) {
				for (int k = j+1; k < n[0]; k++) {
					int max = m[i] + m[j] + m[k];
					if (max <= n[1] && max > sum) {sum = max;}
					else continue;
				}			
			}
		}
		System.out.print(sum);
	}
}