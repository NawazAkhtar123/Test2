package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Railwaywebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.irctc.co.in/nget/train-search");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@area-label='Click here to Login in application']")).click();
driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("Nawaz01031997");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nawaz1997");
driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

 }
