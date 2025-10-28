package OrangeHRM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class loginfunctions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(500);
		
		//WebElementsername on Admin panel
		List<WebElement> username1=driver.findElements(By.xpath("//input[@class='oxd-input oxd-input--active']"));
		username1.get(1).sendKeys("ShraddhaK");
		Thread.sleep(2000);
		
		List<WebElement> RoleSelect=driver.findElements(By.xpath("//div[text()='-- Select --']"));
		RoleSelect.get(0).click();
		Thread.sleep(1000);
		
		//dropdown of selectrole not working properly so used keyboardactions
		Actions dropact=new Actions(driver);
		dropact.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Shraddha");
		Thread.sleep(5000);
		
		List<WebElement> status=driver.findElements(By.xpath("//div[text()='-- Select --']"));
		status.get(0).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();    //click on search button
		

}
}