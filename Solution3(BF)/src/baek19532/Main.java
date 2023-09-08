package baek19532;

/*
 *  1. a를 d배, d를 a배 한다.
 *  2. 식끼리 뺏셈하여 y값과 상수만 남긴다.
 *  3. (b-e)로 (c-f)를 나눈 값을 y에 저장한다.
 *  4. y에 저장된 값을 이용하여 x값을 구한다.
 *  5. x, y값은 공백으로 구분해 출력한다.
 *  
 */

import java.io.*;
import java.util.Arrays;

public class Main {
	
	public static int[] equationX (int[] fun) {
		
		int[] xy = new int[2];
		
		int[] sol = new int[fun.length];
		for (int i = 0; i < fun.length; i++) {
			if (i < 3) {
				sol[i] = fun[i] * fun[3];
			}
			else sol[i] = fun[i] * fun[0];
		}
		
		xy[1]= (sol[2] - sol[5]) /  (sol[1] - sol[4]);
		xy[0] = (sol[2] - (sol[1] * xy[1])) / sol[0];				
		
		return xy;
	} 
	
	public static int[] equationY (int[] fun) {
		
		int[] xy = new int[2];
		
		int[] sol = new int[fun.length];
		for (int i = 0; i < fun.length; i++) {
			if (i < 3) {
				sol[i] = fun[i] * fun[4];
			}
			else sol[i] = fun[i] * fun[1];
		}
		
		xy[0] = (sol[2] - sol[5]) / (sol[0] - sol[3]);
		xy[1]= (sol[2] - sol[0] * xy[0]) /  sol[1];		
		
		return xy;
	} 
	
	public static int[] yame(int[] fun) {
		int[] xy = new int[2];
		
		if(fun[0] == 0) {
			xy[0] = fun[5] / fun[3];
			xy[1] = fun[2] / fun[1];
		} else {
			xy[0] = fun[2] / fun[0];
			xy[1] = fun[5] / fun[4];
		}
		return xy;
	}
	
	public static void main (String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] xy;
		String fin;
		String[] str = br.readLine().split(" ");
		int[] fun = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
			
		try {
			xy = equationX(fun);
		} catch(Exception ex) {
			try {
				xy = equationY(fun);
			} catch(Exception ex2) {
				xy =yame(fun);
			}
		}
		
		fin = Arrays.toString(xy).replaceAll("[^0-9 -]", "");
 		System.out.print(fin);
 			
		
	}
}