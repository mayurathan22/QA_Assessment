package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ThirdScenario {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thava\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//Navigate to the homepage
		driver.get("http://automationpractice.com/index.php");
		//maximize the window 
//		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//Select any item from the POPULAR section and add them to the cart
		driver.findElement(By.xpath("//a[@class='homefeatured']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div[1]/div/a[1]/img")).click();
		
		driver.findElement(By.xpath("//span[.='Add to cart']")).click();;
		WebElement displayMessage = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2"));
		String findText =displayMessage.getText();
		System.out.println("message is :"+findText);
	
	driver.close();
	
	}

}
