package sec01_exam;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int total = 0;

for(int i=0; i<=100; i++) {
	total += i;
}
double avg = total/100.0;

System.out.println("1~100�հ� :"+total);
System.out.println("���"+avg);
	}

}

//���콺 ����:n~m�� �� = (n+m)(n���� m������ ���� ����)/2
//��) 1~100�� �� = (1+100)*(100)/2=5050

//int num = 100;
//int sum = (1+num)*num/2
//double avg = (double)sum/num;