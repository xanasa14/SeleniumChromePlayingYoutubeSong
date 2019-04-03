import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class main {
	WebDriver driver;
	
	public  void invokeBrowser() {
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://www.youtube.com");
		searching();
		}catch (Exception e) {e.printStackTrace(); }	
		
	}
	
	public void searching() throws InterruptedException{
		try {
		
		/* Elements locator techniques 
		 * id 
		 * name
		 * class
		 * tagname
		 * cssSelector
		 * linkText
		 * partialLinkText
		 * xpath     
		 */
			driver.findElement(By.id("search")).click();
			driver.findElement(By.id("search")).sendKeys("Paralyzer - Finger Eleven");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();

			Thread.sleep(3000);			
			driver.findElement(By.linkText("Finger Eleven - Paralyzer lyrics")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"ad-text:t\"]")).click();
			
			
		}catch(InterruptedException e){e.printStackTrace();}
			
	}
	
	public static void main(String[] args) {
		
		main myObj= new main();
		myObj.invokeBrowser();
	}

}

