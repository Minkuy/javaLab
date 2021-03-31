package sec14.exam01_data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);

		SimpleDataFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}

}
