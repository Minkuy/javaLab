package verify.exam00;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ �Է� �ϼ���?");  
		Scanner sc = new Scanner(System. in );   
		
		int year = sc.nextInt(); 
		 
		//  
		 if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {    
			 System.out.println(year + "�� ����");   
			 } else {   
			System.out.println(year + "�� ���");   
				 }
		 Calendar now = Calendar.getInstance();
			Calendar now1 = new GregorianCalendar(); // �ڵ��� ��ȯ

			int year1 = now.get(Calendar.YEAR);
			int month = now.get(Calendar.MONTH) + 1;
			int day = now.get(Calendar.DAY_OF_MONTH);
			int week = now.get(Calendar.DAY_OF_WEEK);

			String strWeek = null;
			switch (week) {
			case Calendar.MONDAY:
				strWeek = "��";
				break;
			case Calendar.TUESDAY:
				strWeek = "ȭ";
				break;
			case Calendar.WEDNESDAY:
				strWeek = "��";
				break;
			case Calendar.THURSDAY:
				strWeek = "��";
				break;
			case Calendar.FRIDAY:
				strWeek = "��";
				break;
			case Calendar.SATURDAY:
				strWeek = "��";
				break;
			case Calendar.SUNDAY:
				strWeek = "��";
			}
			int anPm = now.get(Calendar.AM_PM);
			String strAmPm = null;
			if (anPm == Calendar.AM) {
				strAmPm = "����";
			} else {
				strAmPm = "����";
			}

			int hour = now.get(Calendar.HOUR);
			int minute = now.get(Calendar.MINUTE);
			int second = now.get(Calendar.SECOND);

			System.out.print(year1 + "��");
			System.out.print(month + "��");
			System.out.print(day + "��");
			System.out.print(strWeek + "����");
			System.out.print(strAmPm + "");
			System.out.print(hour + "��");
			System.out.print(minute + "��");
			System.out.print(second + "��");
		 
	}

}
