package verify.exam03;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student Ű�� ������ �����ϴ� HashMap ��ü ����
		//hashmap: map �������̽��� ������ ���� Ŭ����
		//���ʸ� Ÿ�� : Ÿ���� �Ķ���ͷ� ���� Ŭ������ �������̽��� ���Ѵ�.
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		// new Student("1")�� ���� 95�� ����
		hashMap.put(new Student("1"), "95");
		
		// new Student("1") �� ������ �о��
		String score = hashMap.get(new Student("1"));
		System.out.println("1�� �л��� ����: " + score);

		// ���� ��� // 1�� �л��� ����: 95
	}

}
