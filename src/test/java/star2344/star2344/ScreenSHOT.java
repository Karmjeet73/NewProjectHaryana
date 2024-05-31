package star2344.star2344;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class ScreenSHOT {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karmjeet.mor\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement login=driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		WebElement login2=driver.findElement(By.xpath("//span[@class=\"nav-action-inner\"]"));
		
			Actions act=new Actions(driver);
			act.moveToElement(login).build().perform();
			Thread.sleep(5000);
//			act.contextClick(login2).build().perform();
			act.click(login2).build().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("9729951696");
			Thread.sleep(10000);
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			driver.findElement(By.xpath("//input[@tabindex=\"6\"]")).click();
			Thread.sleep(5000);
			   Scanner scanner = new Scanner(System.in);
	            System.out.print("Enter the verification code: ");
	            String verificationCode = scanner.nextLine();
Thread.sleep(5000);
	            // Find the verification code input field and enter the code
	            WebElement verificationCodeField = driver.findElement(By.xpath("//input[@id='cvf-input-code']"));
	            verificationCodeField.sendKeys(verificationCode);Thread.sleep(5000);
driver.findElement(By.xpath("//input[@aria-label=\"Verify OTP Button\"]")).click();
WebElement Search=driver.findElement(By.xpath(("//input[@id=\"twotabsearchtextbox\"]")));

Actions act4=new Actions(driver);
act4.moveToElement(Search).build().perform();
act4.sendKeys("Mobile under 10000");
Thread.sleep(5000);
act4.click(Search);

	            // Close the scanner
	          
	        }
	    

		
		
				
				
				
				
				//input[@class="r4vIwl BV+Dqf"]
//				System.out.println(str1);
//		System.out.println(str.size());
		
//TakesScreenshot screenshot =(TakesScreenshot)driver;
//File Src=screenshot.getScreenshotAs(OutputType.FILE);
//File dest=new File("C:\\Users\\karmjeet.mor\\eclipse-workspace\\star2344\\ScreenShot\\img.png");
//	FileUtils.copyFile(Src,dest);	
		
		
		// TODO Auto-generated method stub

	}


