package verify.exam04;

public class Member {

	private String id = "blue";
	private String name = "ȫ�浿";

	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	// �ۼ� ��ġ

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + ":" + name;

	}
}
