package sec08_exam01_split_Stringtoken;

public class StringSplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
		String names = text.split("&1,1-");
				
				for(String name:names) {
					System.out.println(name);
				}
	}

}
