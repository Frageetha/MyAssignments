package HomeAssign.week3;

public class Button extends WebElement {
	 public void submit() {
	     System.out.println("Button submitted");
	 }
	
public static void main(String[] args) {
	Button b=new Button();
	b.submit();
	b.click();
	b.setText("Welcome");
}
}