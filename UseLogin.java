package exception;

public class UseLogin {
	public static void main(String[] args) throws PasswordException {
		String a="priyadharshini";
		if(a.length()>8) {
			System.out.println("Login success");
		}
		else {
			throw new PasswordException("Invalid");
		}
	}

}
