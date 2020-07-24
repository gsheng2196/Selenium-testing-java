package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class TestFacebookRegistration {
	
	public static void main (String[] args) {
		
		//chromedriver location
		System.setProperty("webdriver.chrome.driver","C://chromedriver_win32/chromedriver.exe");
		
		// initializing driver variable using chromedriver
		WebDriver driver = new ChromeDriver();
		
		//launching facebook.com on the browser
		driver.get("http://www.facebook.com");
		
		//maximize the website's browser
		driver.manage().window().maximize();
		
		//find xpath and entering first name
		driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("Test");
		
		//find xpath and entering last name
		driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("Selenium");
		
		// create object and select class, find xpath for month
		Select month = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		
		//selectBy
		month.selectByVisibleText("Jan");
		
		//create object and select class, find xpath for day
		Select day = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		
		//selectBy
		day.selectByValue("6");
		
		//create object and select class, find xpath for year
		Select year = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		
		//selectBy
		year.selectByIndex(20);
		
		//click gender
		driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).click();
		
		//click 
		driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")).click();
		
		driver.navigate().back();
		
//		driver.quit();
		
	}
}
