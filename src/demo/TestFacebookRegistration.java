package demo;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class TestFacebookRegistration {
	
	public static void main (String[] args) throws InterruptedException{
		
		//chromedriver location
		System.setProperty("webdriver.chrome.driver","C://chromedriver_win32/chromedriver.exe");
		
		// initializing driver variable using chromedriver
		WebDriver driver = new ChromeDriver();
		
		//waits duration
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//launching facebook.com on the browser
		driver.get("http://www.facebook.com");
		
		//maximize the website's browser
		driver.manage().window().maximize();

		Thread.sleep(1000);
		//locating id and entering first name
		driver.findElement(By.id("u_0_m")).sendKeys("Test");
		
		Thread.sleep(1000);
		//locating xpath and entering last name
		driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("Selenium");
		
		// create object and select class, find xpath for month
		Thread.sleep(1000);
		Select month = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		//selectBy
		month.selectByVisibleText("Feb");
		
		Thread.sleep(1000);
		//create object and select class, find xpath for day
		Select day = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		//selectBy
		day.selectByValue("1");
		
		Thread.sleep(1000);
		//create object and select class, find xpath for year
		Select year = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		//selectBy
		year.selectByIndex(25);
		
		Thread.sleep(1000);
		//click gender radio button
		driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).click();
		
		Thread.sleep(1000);
		//click Sign Up button
		driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();
		
		Thread.sleep(1000);
		//click link directing to create page
		driver.findElement(By.linkText("Create a Page")).click();
		
		//to go back 
		driver.navigate().back();
		
		//quit
//		driver.quit();
		
	}
}
