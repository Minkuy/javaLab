package sec12.exam01_wrapper;

public class ValueCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[!128~127초과값을 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과:" + (obj1 == obj2));
		System.out.println("언박싱 후==결과:" + (obj1.intValue()));
		System.out.println("equals() 결과:" + obj1.equals(obj2));
		System.out.println();
		
		
		System.out.println("[~128~127 범위값을 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과:" + (obj3 == obj4));
		System.out.println("언박싱 후==결과:" + (obj3.intValue()));
		System.out.println("equals() 결과:" + obj3.equals(obj4));
		System.out.println();
	}

}
