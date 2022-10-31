package selenium_package;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScenario {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thava\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//Navigate to the homepage
		driver.get("http://automationpractice.com/index.php");
		
		//maximize the window 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Put any search term in the search bar
		driver.findElement(By.id("search_query_top")).sendKeys("printed summer dress"+Keys.ENTER);

		WebElement enterValue = driver.findElement(By.id("search_query_top"));
		 String val = enterValue.getAttribute("value");
	      System.out.println("The input value: " + val.toLowerCase());

		WebElement   result = driver.findElement(By.linkText("Printed Summer Dress"));
	   	
		
		 System.out.println("actual value: "+result.getText().toLowerCase());
//		 
		 if(val.equals(result)) {
			    System.out.println("Here results returned matches the search term ");
			} else {
			    System.out.println("They are not matching");
			}
		 
		 driver.close();

	}

}
