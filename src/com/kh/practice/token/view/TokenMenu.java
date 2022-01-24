package com.kh.practice.token.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	
	public void mainMenu() {
		int input = 0;
		while (true) {
			try {
				System.out.print("1.지정문자열\n2.입력 문자열\n3.프로그램 끝내기\n");
				System.out.print("메뉴 번호 : ");
				input = sc.nextInt();
				switch (input) {
				case 1:
					sc.nextLine();
					tokenMenu();
					break;
				case 2:
					sc.nextLine();
					inputMenu();
					break;
				case 3:
					System.out.println("프로그램 종료합니다.");
					return;
				default:
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("올바르지 않은 입력이 발생했습니다. 다시 입력하세요.");
				if (sc.hasNext()) sc.nextLine();
			} catch (Exception e) {
				System.out.println("예기치 못한 오류 발생 다시 시도 합니다.");
				if (sc.hasNext()) sc.nextLine();
			}
		}
	}
	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 글자 개수 : " + str.length());
		System.out.println("토큰 처리 후 글자 : " + tc.afterToken(str));
		System.out.println("토큰 처리 후 글자 개수 : " + tc.afterToken(str).length());
		System.out.println("모두 대문자로 변환 : " + tc.afterToken(str).toUpperCase());
	}
	public void inputMenu() {
		String input =null;
		System.out.print("문자열을 입력하세요 : ");
		while(true) {
			input = sc.nextLine();
			if(input.equals(null) || input.equals("")) {
				System.out.println("다시 입력하세요.");
				continue;
			}else {
				break;
			}
		}
		
		System.out.println("첫 글자 대문자 : " + tc.firstCap(input));
		System.out.print("찾을 문자를 하나 입력하세요 : ");
		String one = null;
		while(true) {
			one = sc.nextLine();
			if(one.equals(null) || one.equals("")) {
				System.out.println("입력된 문자가 없습니다. 다시 입력하세요.");
				continue;
			}else {
				break;
			}
		}
		System.out.println(one + " 문자가 들어간 개수 : " + tc.findChar(input, one.charAt(0)));
	}
	
	public void PrintLnByString(String str) 
	{
		System.out.println(str);
	}
	
	public void PrintByString(String str) 
	{
		System.out.println(str);
	}
}
