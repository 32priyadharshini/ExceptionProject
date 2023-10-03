package exception;

public class NumberFormat {
	public static void main(String[] args) {
		String a="TN57";
		try {
		int b=Integer.parseInt(a);
		System.out.println(b);
		}
		catch(Exception e) {
			System.out.println("String invalid");
		
		}
	}

}
