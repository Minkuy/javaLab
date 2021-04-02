package verify.exam00;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("연도를 입력 하세요?");
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();

		//
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "은 윤년");
		} else {
			System.out.println(year + "은 평년");
		}

		GregorianCalendar gc = new GregorianCalendar();
		if (gc.isLeapYear(year)) {
			System.out.println("윤년 입니다.");
		} else {
			System.out.println("평년입니다.");
		}

	}

}
