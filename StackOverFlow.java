package exception;

public class StackOverFlow {
	public int a() {
		return b();
	}
	public int b() {
		return a();
	}
	public static void main(String[] args) {
		StackOverFlow s=new StackOverFlow();
		System.out.println(s.a());
	}

}
