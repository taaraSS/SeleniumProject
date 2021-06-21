package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91951\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://retailm1.upskills.in/");
		
		driver.findElement(By.xpath("//*[@class='fa fa-user-o']")).click();
		driver.findElement(By.xpath("//*[@class='fa fa-user-o']")).click();
		driver.findElement(By.id("input-email")).sendKeys("sakshi17@gmail.com");
	    driver.findElement(By.id("input-password")).sendKeys("sakshi");
	    
	    driver.findElement(By.xpath("//*[@class='btn btn-primary' and @value='Login']")).click();
	    driver.findElement(By.xpath("//*[@class='fa fa-user-o']")).click();
	    driver.findElement(By.xpath("//*[@href='http://retailm1.upskills.in/account/logout']")).click();
	}
}
