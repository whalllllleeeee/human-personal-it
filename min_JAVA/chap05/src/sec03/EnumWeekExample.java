package sec03;

import java.util.*;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week week1 = Week.SATURDAY;
		Week week2 = Week.SATURDAY;
		System.out.println(week1 == week2); 		// true
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);			// final int 변수 -> 연도
		System.out.println("현재 연도 : " + year + "년 ");
		
		int month = now.get(Calendar.MONTH) + 1;
		System.out.println("현재 월 : " + month + "월 ");
		
		int day = now.get(Calendar.DAY_OF_MONTH);		
		System.out.println("현재 일 : " + day + "일");
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println("현재 요일 : " + week);
		
		int hour = now.get(Calendar.HOUR);
		System.out.println("현재 시 : " + hour + "시");
		
		int minute = now.get(Calendar.MINUTE);
		System.out.println("현재 분 : " + minute + "분");

		int second = now.get(Calendar.SECOND);
		System.out.println("현재 초 : " + second + "초");
		
		System.out.println("------------------------------------------------------------");
		
		Week today = null;
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WENDSDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.MONDAY) {
			System.out.println("일요일에는 축구를 합니다");
		}else {
			System.out.println("열심히 자바 공부를 합니다");
		}
	}
}


















