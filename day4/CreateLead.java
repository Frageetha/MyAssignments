package week2.day4;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class CreateLead {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		    ChromeDriver driver = new ChromeDriver();
		       driver.get("http://leaftaps.com/opentaps/");
		       driver.manage().window().maximize();
		       driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		       driver.findElement(By.id("password")).sendKeys("crmsfa");
		       driver.findElement(By.className("decorativeSubmit")).click();
		       driver.findElement(By.partialLinkText("CRM")).click();
		       driver.findElement(By.linkText("Leads")).click();
		       driver.findElement(By.linkText("Create Lead")).click();
		       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Frageetha");
		       driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krishnamoorthi");
		       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		       driver.findElement(By.className("smallSubmit")).click();
		       driver.close();
		      
		       

		}

	}
