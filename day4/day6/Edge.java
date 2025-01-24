package week3.day6;

public class Edge extends Browser{

	public void takeSnap() {
		System.out.println("Take a snap");
	}
	public void clearCookies() {
		System.out.println("Clear the cookies");
		
	}
	public static void main(String[] args) {
		Edge e=new Edge();
		e.openURL();
		e.clearCookies();
		e.takeSnap();
		e.closeBrowser();
		e.navigateBack();
	}
}
