package AutomationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class loginpages {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//Validating title
		String title=driver.getTitle();
		if(title.equals("Automation Testing Practice")) 
		{
			System.out.println("Title correct");
			}
		else
		{
			System.out.println("Title incorrect");
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Shraddha kabra");
		driver.findElement(By.id("email")).sendKeys("shraddha123@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9834561267");
		driver.findElement(By.xpath("//textarea [@id='textarea']")).sendKeys("Pune");
		Thread.sleep(3000);
		
		//radio buttons
		driver.findElement(By.id("male")).click();
		//to select  first 3 checkboxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	     
		for(int i=0;i<3;i++) 
		{
			checkboxes.get(i).click();
		}
		//dropdown for colors,Country, animals
		Select country=new Select(driver.findElement(By.xpath("//select[@id='country']")));
		country.selectByVisibleText("Germany"); //this method usd to ineract with dropdowns
		
		Select colors=new Select(driver.findElement(By.xpath("//select[@id='colors']")));
		colors.selectByVisibleText("Red");
		colors.deselectByVisibleText("Red");
		colors.selectByVisibleText("Blue");
		
		Select animal=new Select(driver.findElement(By.xpath("//select[@id='animals']")));
		animal.selectByVisibleText("Deer");
		
	

	
		
	}

}
