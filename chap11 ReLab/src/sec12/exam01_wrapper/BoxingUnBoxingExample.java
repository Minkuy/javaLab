package sec12.exam01_wrapper;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Boxing:������ heap<-�⺻��(stack)
		Integer obj1 = new Integer(100); // integer<- �⺻��
		Integer obj2 = new Integer("200"); // integer<-String
		Integer obj3 = Integer.valueOf("300"); // integer<-String

		// Unboxing : �⺻��<-������
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
