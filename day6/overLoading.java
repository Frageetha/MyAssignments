package week3.day6;

public class overLoading {
public void reportStep(String msg,String status) {
	 System.out.println(msg + status);
} 
public void reportStep(String msg,String status,boolean snap) {
	System.out.println(msg + status + snap);
	
}
public static void main(String[] args) {
	
overLoading lm=new overLoading();
lm.reportStep("hello " , "Welcome ");
lm.reportStep("Selenium ","java " ,false);
}
}
