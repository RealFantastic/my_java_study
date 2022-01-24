package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	private StringTokenizer st;
	
	
	public TokenController() {
		
	}

	public String afterToken(String str) {
		/*공백을 토큰으로 처리한 문자열 반환*/
		String result = "";
		st = new StringTokenizer(str, " ");
		 while(st.hasMoreTokens()) {
			result += st.nextToken();
		}

		return result;
	}
	
	public String firstCap(String input) {
		String result = "";
		/*매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환 */
		result = input.substring(0,1).toUpperCase() +input.substring(1);
		return result;
		
	}
	
	public int findChar(String input, char one) {
		/* 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환 */
		int result = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == one) {
				result ++;
			}
		}
		return result;
	}
}
