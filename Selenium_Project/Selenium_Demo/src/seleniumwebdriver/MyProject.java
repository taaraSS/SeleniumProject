package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyProject {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91951\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://retailm1.upskills.in/");
		driver.findElement(By.xpath("//*[@class='tb_link dropdown tb_menu_system_account_account']")).click();
		driver.findElement(By.xpath("//*[@href='http://retailm1.upskills.in/account/register']")).click();
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Sakshi");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Shreya");
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("lp@gmail.com");
		WebElement phone = driver.findElement(By.name("telephone"));
		phone.sendKeys("9008765432");
		WebElement address1 = driver.findElement(By.name("address_1"));
		address1.sendKeys("Kengeri");
		WebElement address2 = driver.findElement(By.name("address_2"));
		address2.sendKeys("Bgs health and educational city");
		WebElement place = driver.findElement(By.name("city"));
		place.sendKeys("Bangalore");
		WebElement PIN = driver.findElement(By.name("postcode"));
		PIN.sendKeys("560060");
		WebElement DD1 = driver.findElement(By.name("country_id"));
		Select sel1 = new Select(DD1);
		sel1.selectByValue("99");
		Select dropdown = new Select(driver.findElement(By.name("zone_id")));  
		dropdown.selectByValue("1489");  
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("s123");
		WebElement verify = driver.findElement(By.name("confirm"));
		verify.sendKeys("s123");
		driver.findElement(By.xpath("//*[@name='newsletter' and @value='1']")).click();
		driver.findElement(By.xpath("//*[@name='agree' and @value='1']")).click();
		driver.findElement(By.xpath("//*[@class='btn btn-primary' and @value='Continue']")).click();
		driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		
		driver.findElement(By.xpath("//*[@href='http://retailm1.upskills.in/account/logout']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='fa fa-user-o']")).click();
		driver.findElement(By.xpath("//*[@class='fa fa-user-o']")).click();
		driver.findElement(By.id("input-email")).sendKeys("sakshi17@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("sakshi");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='btn btn-primary' and @value='Login']")).click();
        driver.findElement(By.xpath("//*[@class='fa fa-user-o']")).click();
        driver.findElement(By.xpath("//*[@href='http://retailm1.upskills.in/account/logout']")).click();
        Thread.sleep(3000);
		
	}	

}
