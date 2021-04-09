package verify.exam00;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Set s = new HashSet();
		// TreeSet s = new TreeSet();
		Random r = new Random();
		//작성위치 set을 이용
		while(s.size() !=6) {
		n=r.nextInt(45)+1; //1~45 임의의 정수
		s.add(n);
		}
		System.out.println(s);
	}
	
}

//실행결과
//7,41,25,25,30

//정렬
//List list = new ArrayList(s);
//Collection.sort(list);

//syso s
//syso list

