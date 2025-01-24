package week3.day6;


public class Chrome extends Browser{
	public void openIncognito() {
		System.out.println("OpenIncognito");
		
	}
	public void clearCache() {
		System.out.println("ClearCache");
		
	}
	
	public static void main(String[] args) {
		Chrome c=new Chrome();
		c.openURL();
		c.closeBrowser();
		c.openIncognito();
		c.clearCache();
		c.navigateBack();
		
	}

}
