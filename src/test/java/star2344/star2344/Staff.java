package star2344.star2344;
import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Staff {




	    public static void main(String[] args) throws InterruptedException, AWTException {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\karmjeet.mor\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.automationtesting.in/Register.html");
	        driver.manage().window().maximize();
	        
	        Thread.sleep(5000);
//
//	        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("karmjeet mor");
//	        driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Mor");
//	        driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("rohtak road jind");
//	        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("karmjeetmor73@gmail.com");
//	        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9729951696");
//	        driver.findElement(By.xpath("//input[@type='radio']")).click();
//	        Thread.sleep(5000);
//	        WebElement check = driver.findElement(By.xpath("//input[@id='checkbox1']"));
//	        check.click();
//	        driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
//	        driver.findElement(By.xpath("//input[@id='checkbox3']")).click();
//	        Robot robot = new Robot();
//	        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//	        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//	        Thread.sleep(5000);
//	        WebElement drop = driver.findElement(By.id("msdd"));
//	        drop.click();
//	        WebElement drop1 = driver.findElement(By.xpath
//	                ("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[7]/a"));
//	        drop1.click();
//	        WebElement Skills = driver.findElement(By.id("Skills"));
//	        Select star = new Select(Skills);
//	        star.selectByVisibleText("Android");
//
//WebElement dob=driver.findElement(By.xpath("//select[@id='yearbox']"));
//Select DOB=new Select(dob);
//DOB.selectByValue("1998");
//WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
//Select Month=new Select(month);
//Month.selectByValue("March");
//WebElement day=driver.findElement(By.xpath("//select[@placeholder='Day']"));
//Select DAY=new Select(day);
//DAY.selectByValue("22");
//driver.findElement(By.id("firstpassword")).sendKeys("karmjeetmor97@");
//driver.findElement(By.id("secondpassword")).sendKeys("karmjeetmor97@");
////driver.findElement(By.id("imagesrc")).click();
//WebElement fileupload=driver.findElement(By.id("imagesrc"));
//String FILEPATH="C:\\Users\\karmjeet.mor\\Downloads\\a0e80b3a-087e-4df6-a60d-8f215d985ba0.jpg";
//fileupload.sendKeys(FILEPATH);
//
////
////WebElement sourceElement = driver.findElement(By.id("angular"));
////WebElement targetElement = driver.findElement(By.id("droparea"));
////(new Actions(driver)).dragAndDrop(sourceElement, targetElement ).perform();
////WebElement sourceElement1 = driver.findElement(By.id("mongo"));
////WebElement targetElement1 = driver.findElement(By.id("droparea"));
////(new Actions(driver)).dragAndDrop(sourceElement1, targetElement1 ).perform();
//
//
////dynamic drag and drop
////WebElement sourceElement2 = driver.findElement(By.id("angular"));
////WebElement targetElement2 = driver.findElement(By.id("droparea"));
////(new Actions(driver)).dragAndDrop(sourceElement2, targetElement2 ).perform();
////WebElement sourceElement1 = driver.findElement(By.id("mongo"));
////WebElement targetElement1 = driver.findElement(By.id("droparea"));
////(new Actions(driver)).dragAndDrop(sourceElement1, targetElement1 ).perform();
//driver.get("https://demo.automationtesting.in/Dynamic.html");
//driver.manage().window().maximize();
//Robot robot1 = new Robot();
//robot1.keyPress(KeyEvent.VK_PAGE_DOWN);
//robot1.keyRelease(KeyEvent.VK_PAGE_DOWN);
//Thread.sleep(5000);
//	        WebElement sourceElement = driver.findElement(By.id("angular"));
//	        WebElement targetElement = driver.findElement(By.id("droparea"));
//
//	        // Create an instance of the Actions class
//	        Actions actions = new Actions(driver);
//
//	        // Perform the drag-and-drop action
//	        actions.dragAndDrop(sourceElement, targetElement).perform();
//	        
////	      mango  
//	        
//	        WebElement sourceElement1 = driver.findElement(By.id("mongo"));
//	        WebElement targetElement1 = driver.findElement(By.id("droparea"));
//
//	        // Create an instance of the Actions class
//	        Actions actions1 = new Actions(driver);
//
//	        // Perform the drag-and-drop action
//	        actions1.dragAndDrop(sourceElement1, targetElement1).perform();
	        
//	        Actions action = new Actions(driver);
//	        WebElement we = driver.findElement(By.xpath("//*[@id=\\\\\\\"header\\\\\\\"]/nav/div/div[2]/ul/li[3]/a"));
//	        action.moveToElement(we).build().perform();

//	        WebElement elementToHover = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[3]/a"));
//	        actions2.moveToElement(elementToHover).perform();
	     
	    	WebElement e1 =driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[3]/a"));
			Actions act =new Actions(driver);
			act.moveToElement(e1).perform();
			act.click().perform();








	   

	        }
	    }

