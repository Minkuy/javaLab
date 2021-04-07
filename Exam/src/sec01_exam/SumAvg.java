package sec01_exam;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int total = 0;

for(int i=0; i<=100; i++) {
	total += i;
}
double avg = total/100.0;

System.out.println("1~100합계 :"+total);
System.out.println("평균"+avg);
	}

}

//가우스 공식:n~m의 합 = (n+m)(n부터 m까지의 수의 개수)/2
//예) 1~100의 합 = (1+100)*(100)/2=5050

//int num = 100;
//int sum = (1+num)*num/2
//double avg = (double)sum/num;