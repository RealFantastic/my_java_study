package com.kh.practice.leap.controller;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {

	public boolean isLeapYear(int year) {
		boolean result = false;
		result = new GregorianCalendar().isLeapYear(year);
//		GregorianCalendar cal = new GregorianCalendar();
//		result = cal.isLeapYear(year);
		
		return result;
	}
	
	public long leapDate(Calendar c) {
		long result = 0;
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		return result;
	}

}
