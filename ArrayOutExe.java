package exception;

public class ArrayOutExe {
	public static void main(String[] args) {
		int []a= {10,89,76};
		try {
		System.out.println(a[4]);
		}
		catch(Exception b) {
			System.out.println("Array invalid");
		}
	}

}
