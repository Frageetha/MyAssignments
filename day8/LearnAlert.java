package week4.day8;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
    private static Alert alert;

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/alert.xhtml");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//span[text()='show'])[5]")).click();
        alert = driver.switchTo().alert();
        alert.sendKeys("Fragi");
        alert.dismiss();
    
        }
}
