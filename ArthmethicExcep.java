package exception;

public class ArthmethicExcep {
	public static void main(String[] args) {
		System.out.println("hi");
	 int a=10;
	a=5;
		int b=0;
		try {
		System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("don't try to do");
		   // System.out.println(e);
			e.printStackTrace();
			
		}
		finally{
		System.out.println("bye");
		}
	}

}
