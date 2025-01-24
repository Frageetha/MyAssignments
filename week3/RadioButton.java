package HomeAssign.week3;

public class RadioButton extends Button {
	 public void selectRadioButton() {
	     System.out.println("Radio button selected");
	 }
	
public static void main(String[] args) {
	RadioButton rad=new RadioButton();
	rad.selectRadioButton();
	rad.submit();
}
}