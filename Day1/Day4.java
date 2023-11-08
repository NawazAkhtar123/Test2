package Day1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Day4 {


	public static void main(String[] args) throws InterruptedException { 
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a) [3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nawaz");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Akhtar");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("nawazakhtar123@gmail.com");
		Thread.sleep(3000);
		WebElement dayDropDown=driver.findElement(By.xpath("//*[@id='day']"));
		Select days = new Select(dayDropDown);
		days.selectByIndex(2);
		Thread.sleep(2000);
		WebElement MonthDropDown=driver.findElement(By.xpath("//*[@id='day']"));
		Select Month = new Select(MonthDropDown);
		days.selectByIndex(2);
		Thread.sleep(2000);
		WebElement YearDropDown=driver.findElement(By.xpath("//*[@id='day']"));
		Select Year = new Select(YearDropDown);
		days.selectByIndex(2022);	
		
	}

}
