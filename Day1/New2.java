package Day1;


import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class New2 {


	public static void main(String[] args) throws InterruptedException { 
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//FirefoxDriver driver1 = new FirefoxDriver();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'AdminModule')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(@class,'oxd-button-icon')]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//*[contains(text(),'User Role')]//following::div[4]")).sendKeys(Keys.DOWN,Keys.ENTER);
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Virat Kohli");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Status')]//following::div[4]")).sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Nawaz");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

}
