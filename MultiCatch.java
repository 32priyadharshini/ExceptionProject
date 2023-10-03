package exception;

public class MultiCatch {
	public static void main(String[] args) {
		String a="mohan";
		try {
			System.out.println(a.charAt(7));
		}
		catch(ArithmeticException b) {
			System.out.println("Number Not");
		}
		catch(NullPointerException c) {
			System.out.println("null");
		}
		catch(NumberFormatException d) {
			System.out.println("number");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
