package testNGproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ToTestCase {
WebDriver driver;
	
	@BeforeClass
	void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterClass
	void closeBrowser() throws InterruptedException
	{
		Thread.sleep(8000);
		driver.close();
	}
	
	@Test(priority = 1)
	void invalidPwd() throws InterruptedException {
	
		driver.get("https://www.facebook.com");
	WebElement username = driver.findElement(By.id("email"));
	WebElement pwd = driver.findElement(By.id("pass"));
	WebElement lb = driver.findElement(By.name("login"));
	
	Thread.sleep(3000);
	username.sendKeys("9567010287");
	pwd.sendKeys("Shru@8428");
	lb.click();
	Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	void invalidUN() throws InterruptedException {
	
		driver.get("https://www.facebook.com");
	WebElement username = driver.findElement(By.id("email"));
	WebElement pwd = driver.findElement(By.id("pass"));
	WebElement lb = driver.findElement(By.name("login"));
	
	Thread.sleep(3000);
	username.sendKeys("8300912802");
	pwd.sendKeys("Ammu@2805");
	lb.click();
	Thread.sleep(3000);
	}
	
	@Test(priority = 3)
	void validCreds() throws InterruptedException {
	
		driver.get("https://www.facebook.com");
	WebElement username = driver.findElement(By.id("email"));
	WebElement pwd = driver.findElement(By.id("pass"));
	WebElement lb = driver.findElement(By.name("login"));
	
	Thread.sleep(3000);
	username.sendKeys("7710840315");
	pwd.sendKeys("Ammu@2805");
	lb.click();
	Thread.sleep(3000);
	}
	
	@Test(priority = 4)
	void signout() throws InterruptedException {
	
		driver.get("https://www.facebook.com");
	WebElement username = driver.findElement(By.id("email"));
	WebElement pwd = driver.findElement(By.id("pass"));
	WebElement lb = driver.findElement(By.name("login"));
	
	Thread.sleep(3000);
	username.sendKeys("7710840315");
	pwd.sendKeys("Ammu@2805");
	lb.click();
	Thread.sleep(3000);
	
	WebElement moreOption = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div[1]/div[1]/span/div/i"));
    moreOption.click();
    
    Thread.sleep(3000);
    WebElement logout = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div[1]/div[2]/div/div/div/div/span"));
    logout.click();
	}
}
