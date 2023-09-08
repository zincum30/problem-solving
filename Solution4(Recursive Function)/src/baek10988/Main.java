package baek10988;

/*
 * 1. 첫번째 문자와 마지막 문자가 같은지 비교한다. 다르면 -> 0 출력, 같으면 -> 2번으로
 * 2. 두번째 문자와 (마지막 - 1) 문자를 비교
 * 3. 반복
 * 4. 비교가 끝나면 1출력
 * 
 */

import java.util.*;

public class Main {
	
	public static boolean palindrome(String str) {
		return palindrome(str,0);
	}
	
	private static boolean palindrome (String str,int index) {
		String st = str;
		
		if (index == st.length() / 2) {
			return true;
		}
		else if (st.charAt(index) == st.charAt(st.length() - 1- index)) {
			return palindrome(str, (index + 1));
		}
		else {
			return false;
		}
		
		
	}
	

	public boolean isPalindrome2(String s) {
		if(s.length() <=1) return true;
		return s.charAt(0) == s.charAt(s.length() - 1) && isPalindrome2(s.substring(1,s.length() - 2));
	}
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if(palindrome(str)) {
			System.out.print(1);
		}else {
			System.out.print(0);
		}		
		
	}
}