package HomeAssign.week3;

public class CheckBoxButton extends Button {
	 public void clickCheckButton() {
	     System.out.println("CheckBox clicked");
	 }
	 public static void main(String[] args) {
		 CheckBoxButton b1=new  CheckBoxButton();
		 b1.clickCheckButton();
		 b1.submit();
	 }
}