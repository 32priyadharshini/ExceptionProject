 package exception;

import java.util.Scanner;


public class VoterApp{
	
	
	public static void main(String[] args) throws AgeException {
//		Scanner ab=new Scanner(System.in);
//		System.out.println("Enter your name");;
//		String a=ab.next();
//		System.out.println("Enter your age");
//		int b=ab.nextInt();
//		if(b>17) {
//			System.out.println("Welcome to portal");
//		}
//		else {
//			throw new AgeException("not valid age");
//		}
//		System.out.println("Enter the gender");
//		String c=ab.next();
		String a="ram";
		int age=15;
		if(age>17) {
			System.out.println("welcome to out protal");
		}
		else {
			throw new AgeException("not a prop");
		}
		String c="female";
		System.out.println(c);
	}

}
