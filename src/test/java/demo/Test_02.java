package demo;

public class Test_02 {
	private String emailAddress, password;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Test_02(String emailAddress, String password) {
		this.emailAddress = emailAddress;
		this.password = password;
	}

	public void displayInfo() {
		System.out.println(getEmailAddress());
		System.out.println(getPassword());
	}

	public static void main(String[] args) {
		Test_02 obj = new Test_02("dongafc@gmail.com", "SeJava4@");
		obj.displayInfo();
	}

}
