package sec05.exam05_getnv;

public class SystemEnvExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String javahome = System.getenv("JAVA_HOME");
		System.out.println("[JAVA_HOME]" + javahome);
	}

}
