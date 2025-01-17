package week2.day1;

public class Browser{
public String launchBrowser(String browserName) {
	System.out.println("Browser launched successfully");
	return browserName;
	}

public void loadurl() {
	System.out.println("Application url loaded successfully");
	}
public static void main(String[]args) {
	Browser bw=new Browser();
	bw.launchBrowser("Google chrome");
	bw.loadurl();
	}
}