package sec06.exam01_class;

public class ClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car car = new Car();
Class clazz1 = car.getClass();
System.out.println(clazz1.getName()); //��ü. getclass()�� class ��ü�� ��´�
System.out.println(clazz1.getSimpleName());
System.out.println(clazz1.getPackageName());
System.out.println();
try { 
	Class clazz2 = Class.forName("sec06.exam01_class.Car");
	System.out.println(clazz1.getName()); //��ü. getclass()�� class ��ü�� ��´�
	System.out.println(clazz1.getSimpleName());
	System.out.println(clazz1.getPackageName());
	System.out.println();
}catch(ClassNotFoundException e){
	e.printStackTrace();	
	}
	}
}
