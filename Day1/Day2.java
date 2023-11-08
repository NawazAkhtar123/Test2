package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Day2 {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//FirefoxDriver driver1 = new FirefoxDriver();
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//a)[2]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//a)[3]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//a)[4]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//a)[5]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//a)[6]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//a)[7]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//a)[8]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//a)[9]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//a)[10]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//a)[11]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//a)[12]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//a)[13]")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath("//a[contains(@href,'AdminModule')]")).click();
Thread.sleep(3000);
	}

}
