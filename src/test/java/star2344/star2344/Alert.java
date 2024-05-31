package star2344.star2344;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karmjeet.mor\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(5000);
	WebElement Alert=driver.findElement(By.linkText("Alert with Textbox"));
	Alert.click();
	Thread.sleep(5000);
	WebElement ALERTINNER=driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	 ALERTINNER.click();
		Thread.sleep(5000);
	 org.openqa.selenium.Alert alert =driver.switchTo().alert();
	 alert.sendKeys("karmjeet mor");
	 alert.accept();

//	 alert.notifyAll();
	 
		// TODO Auto-generated method stub

	}

}
