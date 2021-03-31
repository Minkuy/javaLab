package sec11.exam01_arrays;

public class Member implements Comparable<Member> {
	
	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}

	String name;

	Member(String name) {
		this.name = name;
	}

}
