package sec01_exam;

import java.util.Scanner;

public class SignPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

System.out.println("정수입력:");
int num = sc.nextInt();

String result = num>0 ?"양수" : (num<0?"음수":"0");
		System.out.println(result);
	}

}
