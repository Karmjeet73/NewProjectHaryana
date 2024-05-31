package star2344.star2344;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Deadlink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karmjeet.mor\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement dr=driver.findElement(By.id("doubleClickBtn"));
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		act.moveToElement(dr).build().perform();
//		act.doubleClick(dr).perform();
//		List<WebElement> li=driver.findElements(By.xpath("//input[@type='radio']"));
//		System.out.println(li.size());
		
		// TODO Auto-generated method stub

	}

}//input[@type="radio"]
