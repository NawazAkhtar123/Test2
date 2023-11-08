package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Fblogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/login/");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("akhtarnawaz01031997@gmail.com");
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Nawaz@1997");
driver.findElement(By.xpath("//button[@type='submit']")).click();
}
}
