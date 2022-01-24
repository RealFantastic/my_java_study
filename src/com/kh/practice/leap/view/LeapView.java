package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	LeapController lc = new LeapController();
	
	public LeapView() {
//		2019년은 평년입니다.
//		총 날짜 수 : 737164
		Calendar today = Calendar.getInstance();	//Singleton pattern 싱글톤 패턴
		//캘린더 안에 만들어져있는 인스턴스가 있으니 그거를 가져가서 써라.
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		
		
		if(lc.isLeapYear(year)) {
			System.out.println(year + "년은 윤년입니다.");
		}else {
			System.out.println(year + "년은 평년입니다.");
		}

		
		
		
		System.out.println(today.getTime());
		
		
	}

}
