package exception;

public class Null {
	public static void main(String[] args) {
		String a=null;
		try {
			
		System.out.println(a.toUpperCase());
	}
		catch(Exception b) {
			System.out.println("String invalid");
		}
	}

}
