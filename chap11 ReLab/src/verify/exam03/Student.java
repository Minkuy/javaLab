package verify.exam03;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student student = (Student) obj;
		if (studentNum.equals(student.getStudentNum())) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum.hashCode();
	}

}
