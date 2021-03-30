package sec08_exam01_split_Stringtoken;

public class StringSplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text "홍길동&이수홍,박연수,김자바-최명호";
		String names = text.split("&1,1-");
				
				for(String name:names) {
					System.out.println(name);
				}
	}

}
