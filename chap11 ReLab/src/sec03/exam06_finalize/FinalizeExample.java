package sec03.exam06_finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = null;
		for (int i = 1; i <= 50; i++) {
			counter = new Counter(i);
			counter = null;
			System.gc(); // garbage collector�� ������ �����Ų��.
		}
	}

	private String no;

	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "�� ��ü�� finalize");
	}

}
