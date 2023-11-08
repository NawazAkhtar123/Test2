package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class New1 {

public static void main(String[]args) throws InterruptedException {
				// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//FirefoxDriver driver1 = new FirefoxDriver();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'AdminModule')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href,'PimModule')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'LeaveModule')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'TimeModule')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'RecruitmentModule')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'MyDetails')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'PerformanceModule')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'dashboard')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'Directory')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'MaintenanceModule')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'ClaimModule')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'Buzz')]")).click();
		Thread.sleep(3000);
	
		
		
		
	}

}
