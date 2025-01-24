package HomeAssign.week3;


public class WebElement {
 public void click() {
     System.out.println("Element clicked");
 }

 public void setText(String text) {
     System.out.println("Text set to: " + text);
 }

public static void main(String[] args) {
	WebElement web=new WebElement();
	web.click();
	
	
}
}
