package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondScenario {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thava\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//Navigate to the homepage
		driver.get("http://automationpractice.com/index.php");
		//maximize the window 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Click on Women category
		driver.findElement(By.className("sf-with-ul")).click();
		
		//Select any value from the Color and Category filter item
		driver.findElement(By.xpath("//input[@id='layered_id_attribute_group_13']]")).click();
		driver.findElement(By.xpath("//input[@id='layered_category_4']")).click();
		driver.close();

	}

}
