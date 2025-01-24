package HomeAssign.week3;

public class TextField extends WebElement {
	 public String getText() {
	     
	     return "Sample text";
	 }
	
public static void main(String[] args) {
	TextField txt=new TextField();
	txt.getText();
	txt.click();
	txt.setText("Happy");
}
}