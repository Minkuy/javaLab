package verify.exam00;

import java.io.InputStream; 
import java.util.Scanner;

public class JumunCheck01 {
	// �ֹι�ȣ Ÿ�缺 �˻��ϴ� �޼ҵ�  
	public boolean juminCheck(String jumin) {
		//�ۼ���ġ
		//1.�ֹι�ȣ �� �ڸ��� �ش� ���ڸ� ���Ѵ�.
		jumin = "800101-1234567";
		int[] mul = {2,3,4,5,6,7,8,9,2,3,4};
		int total=0;
		
		for(int i=0; i<12; i++) {
			total += Integer.parseInt(jumin.substring(i,i+1))*mul[i];
		}
		//2.1�� �������� 11�� ����� �������� ���Ѵ�
		total %=11; //total= 11-total;

		//3.11���� ������ ���� ����"üũ�� ��ȣ��"���ؼ� ������
		int total2 = 11-total;		
		if(tatal2>=10) {
			total2 %=10;
		}			
				if (total2 !=Integer.parseInt(jumin.substring(12,13))) {
					return false;
				}else {
					return true;
				}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 
		  //InputStream is = System.in;   
		  Scanner sc = new Scanner(System.in);     
		  System.out.println("�ֹι�ȣ ���ڸ��� �Է� �ϼ���?");   
		  String jumin1 = sc.next(); // 780331 
		  System.out.println("�ֹι�ȣ ���ڸ��� �Է� �ϼ���?");
		  String jumin2 = sc.next(); // 1011342  
		 
		  if (jumin1.length() != 6) {    
			  System.out.println("�ֹι�ȣ ���ڸ��� 6�ڸ� �Է�");   
			  } else if (jumin2.length() != 7) {    
				  System.out.println("�ֹι�ȣ ���ڸ��� 7�ڸ� �Է�");  
				  } else if (!jc.juminCheck(jumin1 + jumin2)) {    
					  System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");   
					  } else {    System.out.println("�ùٸ� �ֹι�ȣ �Դϴ�"); 
					  }
	}

}
