package verify.exam00;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("연도를 입력 하세요?");  
		Scanner sc = new Scanner(System. in );   
		
		int year = sc.nextInt(); 
		 
		//  
		 if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {    
			 System.out.println(year + "은 윤년");   
			 } else {   
			System.out.println(year + "은 평년");   
				 }
		 Calendar now = Calendar.getInstance();
			Calendar now1 = new GregorianCalendar(); // 자동형 변환

			int year1 = now.get(Calendar.YEAR);
			int month = now.get(Calendar.MONTH) + 1;
			int day = now.get(Calendar.DAY_OF_MONTH);
			int week = now.get(Calendar.DAY_OF_WEEK);

			String strWeek = null;
			switch (week) {
			case Calendar.MONDAY:
				strWeek = "월";
				break;
			case Calendar.TUESDAY:
				strWeek = "화";
				break;
			case Calendar.WEDNESDAY:
				strWeek = "수";
				break;
			case Calendar.THURSDAY:
				strWeek = "목";
				break;
			case Calendar.FRIDAY:
				strWeek = "금";
				break;
			case Calendar.SATURDAY:
				strWeek = "토";
				break;
			case Calendar.SUNDAY:
				strWeek = "일";
			}
			int anPm = now.get(Calendar.AM_PM);
			String strAmPm = null;
			if (anPm == Calendar.AM) {
				strAmPm = "오전";
			} else {
				strAmPm = "오후";
			}

			int hour = now.get(Calendar.HOUR);
			int minute = now.get(Calendar.MINUTE);
			int second = now.get(Calendar.SECOND);

			System.out.print(year1 + "년");
			System.out.print(month + "워");
			System.out.print(day + "일");
			System.out.print(strWeek + "요일");
			System.out.print(strAmPm + "");
			System.out.print(hour + "시");
			System.out.print(minute + "분");
			System.out.print(second + "초");
		 
	}

}
