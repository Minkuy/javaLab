package sec12.exam01_wrapper;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//auto-boxing
		Integer obj = 100;
		System.out.println("value:" + obj.intValue());

		// auto-unboxing
		int value = obj;
		System.out.println("value:" + value);
		
		//¿¬»ê½Ã auyo unboxing
		int result= obj+100;
		System.out.println("result:"+result);

	}

}
