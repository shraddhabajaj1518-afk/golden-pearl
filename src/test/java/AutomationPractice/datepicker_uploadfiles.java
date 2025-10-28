package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker_uploadfiles {

	public static void main(String[] args) {
		//Datepicker :1)by directly entering btext in field
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("11/30/1995");
		
		//2)By using Calendar
		
		String Exptdmonth="June";
		String Exptddate="14";
		String ExptdYear="2025";
		driver.findElement(By.id("datepicker")).click();
		
		while (true) {
		String month=driver.findElement(By.className("ui-datepicker-month")).getText();
		String year=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		if (month.equals(Exptdmonth) && year.equals(ExptdYear)) {
			break; //if year and date quals then stop and exit loop
		}
		else {
			driver.findElement(By.className("//a[@title='Next']")).click();
		}
		driver.findElement(By.xpath("//a[text()='" + Exptddate + "']")).click();
		}
	
driver.findElement(By.xpath("//a[text()='Home']")).click();
	
}
}