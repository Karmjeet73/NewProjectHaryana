package star2344.star2344;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karmjeet.mor\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement Switchto=driver.findElement(By.linkText("SwitchTo"));
		Actions act=new Actions(driver);
		act.moveToElement(Switchto).build().perform();
		Thread.sleep(5000);
		WebElement click=driver.findElement(By.linkText("Windows"));
		click.click();
//		Actions act1=new Actions(driver);
//		act1.contextClick(click).build().perform();
		
		
		

		
		// TODO Auto-generated method stub

	}

}
