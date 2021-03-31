package sec14.exam02_calendr;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		Calendar now1 = new GregorianCalendar(); // �ڵ��� ��ȯ

		int year = now.get(Calendar.YEAR);
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

		System.out.print(year + "��");
		System.out.print(month + "��");
		System.out.print(day + "��");
		System.out.print(strWeek + "����");
		System.out.print(strAmPm + "");
		System.out.print(hour + "��");
		System.out.print(minute + "��");
		System.out.print(second + "��");

	}

}