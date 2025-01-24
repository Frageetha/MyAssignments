package week3.day6;

public class Browser{
	
	static String browserName="Edge";
	static int browserVersion=11;
	public void openURL() {
		System.out.println("open the url");
		
	}
	public void closeBrowser() {
		System.out.println("close the browser");
	}
	public void navigateBack() {
		System.out.println("navigateback");
	}
public static void main(String[] args) {
	System.out.println("Browser name:"+browserName);
	System.out.println("Browser version:"+browserVersion);
}}