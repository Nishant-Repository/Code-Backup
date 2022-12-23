package com.JodaTimeAPI;

import java.time.*;

public class DemoDate_Time {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println("Local date : "+date);
		
		System.out.println("Date : "+date.getDayOfMonth()+" :: Month : "+date.getMonthValue()+" :: Year : "+date.getYear());
		
		LocalTime time = LocalTime.now();
		System.out.println("Local time : "+time);
		
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int ns = time.getNano();
		
		System.out.println("Custom Time :"+ h +":"+m+":"+s+"::"+ns);
		System.out.printf("%d : %d : %d :: %d",h,m,s,ns);	
		
		System.out.println("\nBefore Six month date : "+ date.minusMonths(4));
		System.out.println("After Six month date : "+ date.plusMonths(4));
		
		LocalDate birthday = LocalDate.of(1994,04,01);
		Period p = Period.between(birthday, date);
		System.out.printf("Calculated Age : %d Years, %d Months, %d Days ",p.getYears(),p.getMonths(),p.getDays());
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.printf("\nCurrent Zone : "+zone);
	}

}
