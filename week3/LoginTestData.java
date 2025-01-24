package HomeAssign.week3;


	public class LoginTestData extends TestData {
		 public void enterUsername() {
		     System.out.println("Entering username...");
		 }

		 public void enterPassword() {
		     System.out.println("Entering password...");
		 }
		
		 public static void main(String[] args) {
	    LoginTestData log=new LoginTestData();
	    log.enterUsername();
	    log.enterPassword();
	    log.enterCredentials();
	    log.enterPassword();
}
}
