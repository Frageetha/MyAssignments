package week2.day4;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ChromeDriver driver = new ChromeDriver();
	       driver.get("http://leaftaps.com/opentaps/");
	       driver.manage().window().maximize();
	       driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	       driver.findElement(By.id("password")).sendKeys("crmsfa");
	       driver.findElement(By.className("decorativeSubmit")).click();
	       driver.findElement(By.partialLinkText("CRM")).click();
	       driver.findElement(By.linkText("Create Account")).click();
	       driver.findElement(By.id("accountName")).sendKeys("Frageetha");
	       driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	       driver.findElement(By.id("numberEmployees")).sendKeys("002");
	       driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	       driver.findElement(By.className("smallSubmit")).click();
	       driver.close();
	      
	       

	}

}