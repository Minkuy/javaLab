package verify.exam04;

public class Member {

	private String id = "blue";
	private String name = "홍길동";

	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	// 작성 위치

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + ":" + name;

	}
}
